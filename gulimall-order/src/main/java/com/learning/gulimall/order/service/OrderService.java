package com.learning.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learning.common.utils.PageUtils;
import com.learning.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author vivi
 * @email vivi@gmail.com
 * @date 2020-08-22 18:08:48
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

