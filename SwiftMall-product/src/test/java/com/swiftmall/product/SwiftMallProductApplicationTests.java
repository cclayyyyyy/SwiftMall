package com.swiftmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swiftmall.product.entity.BrandEntity;
import com.swiftmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SwiftMallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("huawei");
//        brandService.updateById(brandEntity);

//        brandEntity.setName("huawei");
//        brandService.save(brandEntity);
//        System.out.println("save successfully...");

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item) -> {
            System.out.println(item);
        });
    }

}
