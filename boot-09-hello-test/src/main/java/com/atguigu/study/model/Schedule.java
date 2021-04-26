package com.atguigu.study.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 医生日程安排表
 * @TableName schedule
 */
@TableName(value ="schedule")
@Data
public class Schedule implements Serializable {
    /**
     * 编号
     */
    @TableId
    private Long id;

    /**
     * 医院编号
     */
    private String hoscode;

    /**
     * 科室编号
     */
    private String depcode;

    /**
     * 职称
     */
    private String title;

    /**
     * 医生名称
     */
    private String docname;

    /**
     * 擅长技能
     */
    private String skill;

    /**
     * 安排日期
     */
    private Date workDate;

    /**
     * 安排时间（0：上午 1：下午）
     */
    private Byte workTime;

    /**
     * 可预约数
     */
    private Integer reservedNumber;

    /**
     * 剩余预约数
     */
    private Integer availableNumber;

    /**
     * 挂号费
     */
    private Integer amount;

    /**
     * 排班状态（-1：停诊 0：停约 1：可约）
     */
    private Byte status;

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
        Schedule other = (Schedule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHoscode() == null ? other.getHoscode() == null : this.getHoscode().equals(other.getHoscode()))
            && (this.getDepcode() == null ? other.getDepcode() == null : this.getDepcode().equals(other.getDepcode()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDocname() == null ? other.getDocname() == null : this.getDocname().equals(other.getDocname()))
            && (this.getSkill() == null ? other.getSkill() == null : this.getSkill().equals(other.getSkill()))
            && (this.getWorkDate() == null ? other.getWorkDate() == null : this.getWorkDate().equals(other.getWorkDate()))
            && (this.getWorkTime() == null ? other.getWorkTime() == null : this.getWorkTime().equals(other.getWorkTime()))
            && (this.getReservedNumber() == null ? other.getReservedNumber() == null : this.getReservedNumber().equals(other.getReservedNumber()))
            && (this.getAvailableNumber() == null ? other.getAvailableNumber() == null : this.getAvailableNumber().equals(other.getAvailableNumber()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHoscode() == null) ? 0 : getHoscode().hashCode());
        result = prime * result + ((getDepcode() == null) ? 0 : getDepcode().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDocname() == null) ? 0 : getDocname().hashCode());
        result = prime * result + ((getSkill() == null) ? 0 : getSkill().hashCode());
        result = prime * result + ((getWorkDate() == null) ? 0 : getWorkDate().hashCode());
        result = prime * result + ((getWorkTime() == null) ? 0 : getWorkTime().hashCode());
        result = prime * result + ((getReservedNumber() == null) ? 0 : getReservedNumber().hashCode());
        result = prime * result + ((getAvailableNumber() == null) ? 0 : getAvailableNumber().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", hoscode=").append(hoscode);
        sb.append(", depcode=").append(depcode);
        sb.append(", title=").append(title);
        sb.append(", docname=").append(docname);
        sb.append(", skill=").append(skill);
        sb.append(", workDate=").append(workDate);
        sb.append(", workTime=").append(workTime);
        sb.append(", reservedNumber=").append(reservedNumber);
        sb.append(", availableNumber=").append(availableNumber);
        sb.append(", amount=").append(amount);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}