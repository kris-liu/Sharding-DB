package cn.blogxin.sharding.plugin;

import cn.blogxin.sharding.plugin.interceptor.ShardingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 加载分表插件
 *
 * @author kris
 */
@Configuration
public class ShardingTableConfiguration {

    @Bean
    public ShardingInterceptor shardingInterceptor() {
        return new ShardingInterceptor();
    }
}
