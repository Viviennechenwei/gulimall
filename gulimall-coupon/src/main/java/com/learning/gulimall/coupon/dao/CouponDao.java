package com.learning.gulimall.coupon.dao;

import com.learning.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author vivi
 * @email vivi@gmail.com
 * @date 2020-08-22 17:34:49
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
