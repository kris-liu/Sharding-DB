package cn.blogxin.sharding.plugin;

import cn.blogxin.sharding.plugin.spring.ShardingDbAutoConfig;
import cn.blogxin.sharding.plugin.strategy.DefaultShardingStrategy;
import cn.blogxin.sharding.plugin.strategy.ShardingStrategy;
import cn.blogxin.sharding.plugin.context.ShardingContext;
import com.baomidou.mybatisplus.toolkit.PluginUtils;
import com.google.common.collect.Maps;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

/**
 * mybatis分表插件
 *
 * @author kris
 * @see ShardingDbAutoConfig
 */
@Intercepts({@Signature(method = "prepare", type = StatementHandler.class, args = {Connection.class, Integer.class})})
public class ShardingInterceptor implements Interceptor {

    private final static Logger logger = LoggerFactory.getLogger(ShardingInterceptor.class);

    private static final String DELEGATE_BOUND_SQL_SQL = "delegate.boundSql.sql";
    private static final String DELEGATE_MAPPED_STATEMENT_ID = "delegate.mappedStatement.id";
    private static final String DELEGATE_PARAMETER_HANDLER_PARAMETER_OBJECT = "delegate.parameterHandler.parameterObject";
    private static final String PARAM_1 = "param1";
    private static final String POINT = ".";

    private static final ShardingStrategy DEFAULT_SHARDING_STRATEGY = new DefaultShardingStrategy();
    private static final Map<String, ShardingStrategy> SHARDING_STRATEGY_MAP = Maps.newConcurrentMap();

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        StatementHandler statementHandler = (StatementHandler) PluginUtils.realTarget(invocation.getTarget());
        MetaObject metaObject = SystemMetaObject.forObject(statementHandler);

        String id = (String) metaObject.getValue(DELEGATE_MAPPED_STATEMENT_ID);
        String className = id.substring(0, id.lastIndexOf(POINT));
        Sharding sharding = Class.forName(className).getDeclaredAnnotation(Sharding.class);
        if (sharding != null && sharding.sharding()) {
            String sql = (String) metaObject.getValue(DELEGATE_BOUND_SQL_SQL);
            sql = sql.replaceAll(sharding.tableName(), getTargetTableName(metaObject, sharding));
            metaObject.setValue(DELEGATE_BOUND_SQL_SQL, sql);
        }
        return invocation.proceed();
    }

    private String getTargetTableName(MetaObject metaObject, Sharding sharding) throws Exception {
        String shardingKey = getShardingKey(metaObject);
        String targetTableName;
        if (!StringUtils.isEmpty(shardingKey)) {
            targetTableName = getShardingStrategy(sharding).getTargetTableName(sharding.tableName(), sharding.count(), shardingKey);
        } else if (StringUtils.isEmpty(shardingKey) && !StringUtils.isEmpty(ShardingContext.getSharding())) {
            targetTableName = DEFAULT_SHARDING_STRATEGY.getTargetTableName(sharding.tableName(), sharding.count(), ShardingContext.getSharding());
        } else {
            throw new RuntimeException("没有找到分表信息。shardingKey=" + shardingKey + "，ShardingContext=" + ShardingContext.getSharding());
        }
        return targetTableName;
    }

    private ShardingStrategy getShardingStrategy(Sharding sharding) throws Exception {
        String strategyClassName = sharding.strategy();
        ShardingStrategy shardingStrategy = SHARDING_STRATEGY_MAP.get(strategyClassName);
        if (shardingStrategy == null) {
            ShardingStrategy strategy = (ShardingStrategy) Class.forName(strategyClassName).newInstance();
            SHARDING_STRATEGY_MAP.putIfAbsent(strategyClassName, strategy);
            shardingStrategy = SHARDING_STRATEGY_MAP.get(strategyClassName);
        }
        return shardingStrategy;
    }

    private String getShardingKey(MetaObject metaObject) {
        String shardingKey = null;
        Object parameterObject = metaObject.getValue(DELEGATE_PARAMETER_HANDLER_PARAMETER_OBJECT);
        if (parameterObject instanceof String) {
            shardingKey = (String) parameterObject;
        } else if (parameterObject instanceof Map) {
            Map<String, Object> parameterMap = (Map<String, Object>) parameterObject;
            Object param1 = parameterMap.get(PARAM_1);
            if (param1 instanceof String) {
                shardingKey = (String) param1;
            }
        }
        return shardingKey;
    }

    @Override
    public Object plugin(Object target) {
        if (target instanceof StatementHandler) {
            return Plugin.wrap(target, this);
        }
        return target;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
