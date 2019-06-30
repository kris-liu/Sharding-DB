# Sharding-DB

分库分表工具


## 分表功能：

1. 引入分表配置启动类

    ```
    <dependency>
        <groupId>cn.blogxin.sharding</groupId>
        <artifactId>sharding-db-spring-boot-starter</artifactId>
        <version>${project.parent.version}</version>
    </dependency>
    ```

2. 添加数据库连接配置，该配置与正常DB连接池配置相同

    ```
    spring.datasource.driverClassName=com.mysql.jdbc.Driver
    spring.datasource.url=jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8
    spring.datasource.username=root
    spring.datasource.password=
    ```

3. 在mybatis的mapper接口上添加`@Sharding`注解并配置各项属性，包括库名，表名，分表策略，分表数

    ```
    @Sharding(sharding = true, databaseName = "test", tableName = "order_info", strategy = "cn.blogxin.sharding.plugin.strategy.HashShardingStrategyWithDataBase", count = 10)
    ```



## 分库分表功能：

1. 引入分库配置启动类，该启动类包括了分表配置启动类

    ```
    <dependency>
        <groupId>cn.blogxin.sharding</groupId>
        <artifactId>sharding-db-spring-boot-starter</artifactId>
        <version>${project.parent.version}</version>
    </dependency>
    ```

2. `application.properties`配置文件添加该配置用于启动分库能力
    
    ```
    sharding.databases=enable
    ```

3. 添加数据库连接配置，配置库名，分库策略，分库数量，主库从库，每个数据库的连接池配置

    ```
    sharding.databases.test.shardingStrategy=cn.blogxin.sharding.plugin.strategy.database.DefaultShardingDataBaseStrategy
    sharding.databases.test.shardingCount=2
    
    sharding.databases.test.dataSource.master.0.driverClassName=com.mysql.jdbc.Driver
    sharding.databases.test.dataSource.master.0.url=jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8
    sharding.databases.test.dataSource.master.0.username=root
    sharding.databases.test.dataSource.master.0.password=
    
    sharding.databases.test.dataSource.master.1.driverClassName=com.mysql.jdbc.Driver
    sharding.databases.test.dataSource.master.1.url=jdbc:mysql://127.0.0.1:3306/test1?useUnicode=true&characterEncoding=utf-8
    sharding.databases.test.dataSource.master.1.username=root
    sharding.databases.test.dataSource.master.1.password=
    
    sharding.databases.test.dataSource.slave.0.driverClassName=com.mysql.jdbc.Driver
    sharding.databases.test.dataSource.slave.0.url=jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8
    sharding.databases.test.dataSource.slave.0.username=root
    sharding.databases.test.dataSource.slave.0.password=
    
    sharding.databases.test.dataSource.slave.1.driverClassName=com.mysql.jdbc.Driver
    sharding.databases.test.dataSource.slave.1.url=jdbc:mysql://127.0.0.1:3306/test1?useUnicode=true&characterEncoding=utf-8
    sharding.databases.test.dataSource.slave.1.username=root
    sharding.databases.test.dataSource.slave.1.password=
    ```

4. 在mybatis的mapper接口上添加`@Sharding`注解并配置各项属性，包括库名，表名，分表策略，分表数

    ```
    @Sharding(sharding = true, databaseName = "test", tableName = "order_info", strategy = "cn.blogxin.sharding.plugin.strategy.HashShardingStrategyWithDataBase", count = 10)
    ```


## 示例

参见该项目的`demo`模块，该例子中，`test`库分两个库，每个库中各5张`order_info`表和`order_ext`表，总共分了10张表
