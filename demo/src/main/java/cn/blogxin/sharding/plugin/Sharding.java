package cn.blogxin.sharding.plugin;

import cn.blogxin.sharding.plugin.strategy.ShardingStrategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mapper上添加此注解后，需要将第一个参数固定为String类型的分表因子，若不是String类型或者参数值是null，则直接使用ShardingContext中的分表位
 *
 * @author kris
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Sharding {

    /**
     * 是否分表
     */
    boolean sharding() default true;

    /**
     * 库名
     */
    String databaseName();

    /**
     * 基础表名
     */
    String tableName();

    /**
     * @see ShardingStrategy
     * 分表策略
     */
    String strategy();

    /**
     * 分表数量
     */
    int count();

}
