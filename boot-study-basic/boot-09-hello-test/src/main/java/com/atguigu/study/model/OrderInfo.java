package com.atguigu.study.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单表
 * @TableName order_info
 */
@TableName(value ="order_info")
@Data
public class OrderInfo implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 排班id
     */
    private Long scheduleId;

    /**
     * 就诊人id
     */
    private Long patientId;

    /**
     * 预约号序
     */
    private Integer number;

    /**
     * 建议取号时间
     */
    private String fetchTime;

    /**
     * 取号地点
     */
    private String fetchAddress;

    /**
     * 医事服务费
     */
    private Integer amount;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 退号时间
     */
    private Date quitTime;

    /**
     * 订单状态
     */
    private Byte orderStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 逻辑删除(1:已删除，0:未删除)
     */
    private Byte isDeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderInfo other = (OrderInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScheduleId() == null ? other.getScheduleId() == null : this.getScheduleId().equals(other.getScheduleId()))
            && (this.getPatientId() == null ? other.getPatientId() == null : this.getPatientId().equals(other.getPatientId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getFetchTime() == null ? other.getFetchTime() == null : this.getFetchTime().equals(other.getFetchTime()))
            && (this.getFetchAddress() == null ? other.getFetchAddress() == null : this.getFetchAddress().equals(other.getFetchAddress()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getQuitTime() == null ? other.getQuitTime() == null : this.getQuitTime().equals(other.getQuitTime()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScheduleId() == null) ? 0 : getScheduleId().hashCode());
        result = prime * result + ((getPatientId() == null) ? 0 : getPatientId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getFetchTime() == null) ? 0 : getFetchTime().hashCode());
        result = prime * result + ((getFetchAddress() == null) ? 0 : getFetchAddress().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getQuitTime() == null) ? 0 : getQuitTime().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scheduleId=").append(scheduleId);
        sb.append(", patientId=").append(patientId);
        sb.append(", number=").append(number);
        sb.append(", fetchTime=").append(fetchTime);
        sb.append(", fetchAddress=").append(fetchAddress);
        sb.append(", amount=").append(amount);
        sb.append(", payTime=").append(payTime);
        sb.append(", quitTime=").append(quitTime);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}