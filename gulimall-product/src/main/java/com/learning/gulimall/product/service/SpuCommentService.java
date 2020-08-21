package com.learning.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learning.common.utils.PageUtils;
import com.learning.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author vivi
 * @email vivi@gmail.com
 * @date 2020-08-21 22:00:08
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

