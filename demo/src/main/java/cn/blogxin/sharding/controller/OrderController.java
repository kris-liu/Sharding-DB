package cn.blogxin.sharding.controller;

import cn.blogxin.sharding.entity.OrderInfo;
import cn.blogxin.sharding.mappper.OrderInfoMapper;
import cn.blogxin.sharding.plugin.context.ShardingContext;
import org.springframework.web.bind.annotation.PathVariable;
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

//    @RequestMapping("/getOrderInfos")
//    public List<OrderInfo> getOrderInfos() {
//        return orderInfoMapper.getAll();
//    }

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
        orderInfoMapper.insert(orderInfo);
    }

    @RequestMapping("/insert2")
    public void insert2(OrderInfo orderInfo) {
        orderInfoMapper.insert2(orderInfo.getOrderId(), orderInfo);
    }

    @RequestMapping(value = "update")
    public void update(OrderInfo orderInfo) {
        ShardingContext.setSharding("0");
        orderInfoMapper.update(orderInfo);
        ShardingContext.clear();
    }

    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") String orderId) {
        orderInfoMapper.delete(orderId);
    }

}
