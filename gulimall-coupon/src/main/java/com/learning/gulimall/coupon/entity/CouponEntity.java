package com.learning.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券信息
 * 
 * @author vivi
 * @email vivi@gmail.com
 * @date 2020-08-22 17:34:49
 */
@Data
@TableName("sms_coupon")
public class CouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Integer couponType;
	/**
	 * $column.comments
	 */
	private String couponImg;
	/**
	 * $column.comments
	 */
	private String couponName;
	/**
	 * $column.comments
	 */
	private Integer num;
	/**
	 * $column.comments
	 */
	private BigDecimal amount;
	/**
	 * $column.comments
	 */
	private Integer perLimit;
	/**
	 * $column.comments
	 */
	private BigDecimal minPoint;
	/**
	 * $column.comments
	 */
	private Date startTime;
	/**
	 * $column.comments
	 */
	private Date endTime;
	/**
	 * $column.comments
	 */
	private Integer useType;
	/**
	 * $column.comments
	 */
	private String note;
	/**
	 * $column.comments
	 */
	private Integer publishCount;
	/**
	 * $column.comments
	 */
	private Integer useCount;
	/**
	 * $column.comments
	 */
	private Integer receiveCount;
	/**
	 * $column.comments
	 */
	private Date enableStartTime;
	/**
	 * $column.comments
	 */
	private Date enableEndTime;
	/**
	 * $column.comments
	 */
	private String code;
	/**
	 * $column.comments
	 */
	private Integer memberLevel;
	/**
	 * $column.comments
	 */
	private Integer publish;

}
