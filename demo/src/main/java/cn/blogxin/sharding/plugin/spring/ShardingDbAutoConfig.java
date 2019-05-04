package cn.blogxin.sharding.plugin.spring;

import cn.blogxin.sharding.plugin.ShardingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 加载分表插件
 * @author kris
 */
@Configuration
public class ShardingDbAutoConfig {

    @Bean
    public ShardingInterceptor shardingInterceptor() {
        return new ShardingInterceptor();
    }
}
