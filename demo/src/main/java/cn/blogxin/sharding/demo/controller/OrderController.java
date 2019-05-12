package cn.blogxin.sharding.demo.controller;

import cn.blogxin.sharding.plugin.ShardingProperties;
import cn.blogxin.sharding.demo.entity.Order;
import cn.blogxin.sharding.demo.entity.OrderInfo;
import cn.blogxin.sharding.demo.mappper.OrderInfoMapper;
import cn.blogxin.sharding.plugin.ShardingContext;
import cn.blogxin.sharding.demo.service.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author kris
 */
@RestController
public class OrderController {

    @Resource
    private OrderInfoMapper orderInfoMapper;

    @Resource
    private OrderService orderService;

    @Resource
    private ShardingProperties shardingProperties;


    @RequestMapping("/query")
    public OrderInfo query(String orderId) {
        return orderInfoMapper.query(orderId);
    }

    @RequestMapping("/query2")
    public OrderInfo query2(String orderId, int status) {
        return orderInfoMapper.query2(orderId, status);
    }

    @RequestMapping("/insert")
    public void insert(OrderInfo orderInfo) {
        orderInfoMapper.insert(orderInfo.getOrderId(), orderInfo);
    }

    @RequestMapping(value = "update")
    public void update(OrderInfo orderInfo) {
        ShardingContext.setShardingTable("0");
        orderInfoMapper.update(orderInfo);
        ShardingContext.clear();
    }

    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") String orderId) {
        orderInfoMapper.delete(orderId);
    }


    @RequestMapping("/insertAll")
    public void insert(@RequestBody Order order) {
        orderService.insert(order.getOrderInfo(), order.getOrderExt());
    }
}
