package cn.blogxin.sharding.plugin.strategy;

import cn.blogxin.sharding.plugin.Sharding;

/**
 * 分表策略
 *
 * @author kris
 */
public interface ShardingStrategy {

    String UNDERLINE = "_";

    /**
     * 获取分表位的实际表名
     *
     * @param sharding    Sharding信息
     * @param shardingKey 分库分表因子
     * @return 带分表位的实际表名
     */
    String getTargetTableName(Sharding sharding, String shardingKey);

    /**
     * 计算分表
     *
     * @param sharding    Sharding信息
     * @param shardingKey 分库分表因子
     * @return 计算分表
     */
    Integer calculateTableSuffix(Sharding sharding, String shardingKey);
}
