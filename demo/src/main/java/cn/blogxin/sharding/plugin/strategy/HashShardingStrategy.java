package cn.blogxin.sharding.plugin.strategy;

/**
 * 对分表因子param进行hash取模计算得到分表位
 * @author kris
 */
public class HashShardingStrategy implements ShardingStrategy {

    @Override
    public String getTargetTableName(String baseTableName, int shardingCount, Object param) {
        return baseTableName + UNDERLINE + Math.abs(param.hashCode()) % shardingCount;
    }

}
