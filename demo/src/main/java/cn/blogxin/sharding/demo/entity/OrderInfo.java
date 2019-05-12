package cn.blogxin.sharding.demo.entity;

/**
 * @author kris
 */
public class OrderInfo {

    private long id;
    private String orderId;
    private int status;
    private String remark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                '}';
    }
}
