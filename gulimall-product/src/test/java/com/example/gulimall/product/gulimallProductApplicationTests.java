package com.example.gulimall.product;

import com.example.gulimall.product.entity.BrandEntity;
import com.example.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class gulimallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void test01() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("遥遥领先");
        brandEntity.setName("HUAWEI");
        brandService.save(brandEntity);
        System.out.println("save success");
    }
}
