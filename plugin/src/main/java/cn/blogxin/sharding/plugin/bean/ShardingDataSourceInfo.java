package cn.blogxin.sharding.plugin.bean;

import cn.blogxin.sharding.plugin.strategy.database.ShardingDataBaseStrategy;

/**
 * @author kris
 */
public class ShardingDataSourceInfo {

    /**
     * 分库策略
     */
    private ShardingDataBaseStrategy shardingDataBaseStrategy;

    /**
     * 分库数量
     */
    private Integer shardingCount;

    public ShardingDataBaseStrategy getShardingDataBaseStrategy() {
        return shardingDataBaseStrategy;
    }

    public void setShardingDataBaseStrategy(ShardingDataBaseStrategy shardingDataBaseStrategy) {
        this.shardingDataBaseStrategy = shardingDataBaseStrategy;
    }

    public Integer getShardingCount() {
        return shardingCount;
    }

    public void setShardingCount(Integer shardingCount) {
        this.shardingCount = shardingCount;
    }
}
