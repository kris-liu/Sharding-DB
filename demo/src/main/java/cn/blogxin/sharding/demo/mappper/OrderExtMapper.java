package cn.blogxin.sharding.demo.mappper;

import cn.blogxin.sharding.demo.entity.OrderExt;
import cn.blogxin.sharding.demo.entity.OrderInfo;
import cn.blogxin.sharding.plugin.Sharding;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author kris
 */
@Mapper
@Repository
@Sharding(sharding = true, databaseName = "test", tableName = "order_ext", strategy = "cn.blogxin.sharding.plugin.strategy.HashShardingStrategyWithDataBase", count = 10)
public interface OrderExtMapper {

    OrderInfo query(String orderId);

    void insert(@Param("orderId") String orderId, @Param("orderExt") OrderExt orderExt);

    void update(OrderExt orderExt);

    void delete(String orderId);

}
