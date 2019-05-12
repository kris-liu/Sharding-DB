package cn.blogxin.sharding.demo.service;

import cn.blogxin.sharding.demo.entity.OrderExt;
import cn.blogxin.sharding.demo.entity.OrderInfo;

/**
 * @author kris
 */
public interface OrderService {

    void insert(OrderInfo orderInfo, OrderExt orderExt);
}
