package cn.blogxin.sharding.plugin.strategy.database;

/**
 * 分库策略
 *
 * @author kris
 */
public interface ShardingDataBaseStrategy {

    /**
     * 计算获取对应分库key
     *
     * @param sharingDataBaseCount    分库数量
     * @param sharingTableCount       分表数量
     * @param currentShardingTableKey 当前分表位
     */
    Integer calculate(int sharingDataBaseCount, int sharingTableCount, int currentShardingTableKey);
}
