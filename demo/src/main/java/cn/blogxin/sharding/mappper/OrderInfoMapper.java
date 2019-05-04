package cn.blogxin.sharding.mappper;

import cn.blogxin.sharding.entity.OrderInfo;
import cn.blogxin.sharding.plugin.Sharding;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author kris
 */
@Mapper
@Repository
@Sharding(sharding = true, tableName = "order_info", strategy = "cn.blogxin.sharding.plugin.strategy.HashShardingStrategy", count = 2)
public interface OrderInfoMapper {

//    List<OrderInfo> getAll();

    OrderInfo query(String orderId);

    OrderInfo query2(@Param("orderId") String orderId, @Param("status")int status);

    void insert(OrderInfo orderInfo);

    void insert2(@Param("orderId") String orderId, @Param("orderInfo")OrderInfo orderInfo);

    void update(OrderInfo orderInfo);

    void delete(String orderId);

}
