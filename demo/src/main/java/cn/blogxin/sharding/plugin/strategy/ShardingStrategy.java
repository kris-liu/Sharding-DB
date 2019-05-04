package cn.blogxin.sharding.plugin.strategy;

/**
 * 分表策略
 * @author kris
 */
public interface ShardingStrategy {

    String UNDERLINE = "_";

    /**
     * @param baseTableName 基础表名
     * @param shardingCount 分表数量
     * @param param 分表因子
     * @return 带分表位的实际表名
     */
    String getTargetTableName(String baseTableName, int shardingCount, Object param);

}
