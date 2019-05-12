package cn.blogxin.sharding.plugin.strategy;

import cn.blogxin.sharding.plugin.Sharding;

/**
 * 对分表因子shardingKey进行hash取模计算得到分表位
 *
 * @author kris
 */
public class HashShardingStrategyWithDataBase extends AbstractShardingStrategyWithDataBase {

    @Override
    public Integer calculateTableSuffix(Sharding sharding, String shardingKey) {
        return Math.abs(shardingKey.hashCode()) % sharding.count();
    }

}
