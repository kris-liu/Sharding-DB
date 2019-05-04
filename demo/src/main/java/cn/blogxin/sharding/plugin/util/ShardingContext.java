package cn.blogxin.sharding.plugin.util;

/**
 * 分表上下文，直接填充分表位，使用完成后必须及时调用clear方法清空分表上下文，主要用于按表进行扫描
 * @author kris
 */
public class ShardingContext {

    /**
     * 分表位
     */
    private static final ThreadLocal<String> SHARDING = new ThreadLocal<>();

    public static String getSharding() {
        return ShardingContext.SHARDING.get();
    }

    public static void setSharding(String sharding) {
        ShardingContext.SHARDING.set(sharding);
    }

    public static void clear() {
        ShardingContext.SHARDING.remove();
    }
}
