package com.learning.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.learning.gulimall.product.entity.BrandEntity;
import com.learning.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimalProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(2L);
        brandEntity.setDescript("Vivienne's apple");

//        brandEntity.setName("Apple");
////        brandService.save(brandEntity);
////        System.out.println("save brand success...");

//        brandService.updateById(brandEntity);

        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brand_id.forEach(i -> System.out.println(i));

    }

}
