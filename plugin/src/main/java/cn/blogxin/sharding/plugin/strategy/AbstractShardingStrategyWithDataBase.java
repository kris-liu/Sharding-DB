package cn.blogxin.sharding.plugin.strategy;

import cn.blogxin.sharding.plugin.Sharding;
import cn.blogxin.sharding.plugin.ShardingContext;
import cn.blogxin.sharding.plugin.bean.ShardingDataSourceInfo;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 带分库的分表策略，使用分库插件时，分表插件必须继承该类
 *
 * @author kris
 */
public abstract class AbstractShardingStrategyWithDataBase implements ShardingStrategy {

    private static Map<String, ShardingDataSourceInfo> shardingDataSourceInfoMap = Maps.newHashMap();

    public static void setShardingDataSourceInfoMap(Map<String, ShardingDataSourceInfo> shardingDataSourceInfoMap) {
        AbstractShardingStrategyWithDataBase.shardingDataSourceInfoMap = shardingDataSourceInfoMap;
    }

    @Override
    public String getTargetTableName(Sharding sharding, String shardingKey) {
        Integer tableSuffix = calculateTableSuffix(sharding, shardingKey);
        ShardingDataSourceInfo shardingDataSourceInfo = shardingDataSourceInfoMap.get(sharding.databaseName());
        if (shardingDataSourceInfo != null) {
            int databaseNum = shardingDataSourceInfo.getShardingDataBaseStrategy().calculate(shardingDataSourceInfo.getShardingCount(), sharding.count(), tableSuffix);
            ShardingContext.setShardingDatabase(sharding.databaseName() + ShardingContext.getMasterSalve() + databaseNum);
        }
        return getTableName(sharding.tableName(), tableSuffix);
    }

    private String getTableName(String tableName, Integer shardingKey) {
        return tableName + UNDERLINE + shardingKey;
    }

}
