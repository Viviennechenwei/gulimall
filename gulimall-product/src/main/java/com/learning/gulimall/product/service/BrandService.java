package com.learning.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learning.common.utils.PageUtils;
import com.learning.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author vivi
 * @email vivi@gmail.com
 * @date 2020-08-21 22:00:08
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

