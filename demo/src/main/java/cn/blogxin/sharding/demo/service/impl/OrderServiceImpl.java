package cn.blogxin.sharding.demo.service.impl;

import cn.blogxin.sharding.demo.entity.OrderExt;
import cn.blogxin.sharding.demo.entity.OrderInfo;
import cn.blogxin.sharding.demo.mappper.OrderExtMapper;
import cn.blogxin.sharding.demo.mappper.OrderInfoMapper;
import cn.blogxin.sharding.demo.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author kris
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderInfoMapper orderInfoMapper;

    @Resource
    private OrderExtMapper orderExtMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(OrderInfo orderInfo, OrderExt orderExt) {
        orderInfoMapper.insert(orderInfo.getOrderId(), orderInfo);
//        System.out.println(1/0);
        orderExtMapper.insert(orderExt.getOrderId(), orderExt);
    }
}
