package cn.blogxin.sharding.plugin;

import cn.blogxin.sharding.plugin.bean.Database;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @author kris
 */
@Configuration
@ConfigurationProperties(prefix = "sharding")
public class ShardingProperties {

    private Map<String, Database> databases;

    public Map<String, Database> getDatabases() {
        return databases;
    }

    public void setDatabases(Map<String, Database> databases) {
        this.databases = databases;
    }

}
