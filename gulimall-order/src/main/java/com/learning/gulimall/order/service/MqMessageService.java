package com.learning.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learning.common.utils.PageUtils;
import com.learning.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author vivi
 * @email vivi@gmail.com
 * @date 2020-08-22 18:08:48
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

