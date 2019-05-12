package cn.blogxin.sharding.demo.entity;

/**
 * @author kris
 */
public class Order {

    private OrderInfo orderInfo;
    private OrderExt orderExt;

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public OrderExt getOrderExt() {
        return orderExt;
    }

    public void setOrderExt(OrderExt orderExt) {
        this.orderExt = orderExt;
    }
}
