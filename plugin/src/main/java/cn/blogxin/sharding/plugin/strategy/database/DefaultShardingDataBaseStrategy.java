package cn.blogxin.sharding.plugin.strategy.database;

/**
 * 默认分库策略
 *
 * @author kris
 */
public class DefaultShardingDataBaseStrategy implements ShardingDataBaseStrategy {

    @Override
    public Integer calculate(int sharingDataBaseCount, int sharingTableCount, int currentShardingTableKey) {
        if (sharingTableCount >= sharingDataBaseCount && sharingTableCount % sharingDataBaseCount == 0) {
            int base = sharingTableCount / sharingDataBaseCount;
            return currentShardingTableKey / base;
        }
        throw new RuntimeException("分库分表规则配置错误");
    }
}
