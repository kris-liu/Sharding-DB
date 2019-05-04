package cn.blogxin.sharding.plugin.strategy;

/**
 * 使用分表因子param直接作为分表位
 * @author kris
 */
public class DefaultShardingStrategy implements ShardingStrategy {

    @Override
    public String getTargetTableName(String baseTableName, int shardingCount, Object param) {
        return baseTableName + UNDERLINE + param;
    }

}
