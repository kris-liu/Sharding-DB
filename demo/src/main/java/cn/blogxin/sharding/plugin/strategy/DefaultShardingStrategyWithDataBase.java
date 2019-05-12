package cn.blogxin.sharding.plugin.strategy;

import cn.blogxin.sharding.plugin.Sharding;

/**
 * 使用分表因子shardingKey直接作为分表位
 *
 * @author kris
 */
public class DefaultShardingStrategyWithDataBase extends AbstractShardingStrategyWithDataBase {

    @Override
    public Integer calculateTableSuffix(Sharding sharding, String shardingKey) {
        return Integer.valueOf(shardingKey);
    }

}
