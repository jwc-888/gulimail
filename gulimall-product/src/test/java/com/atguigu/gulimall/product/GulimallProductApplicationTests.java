package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.atguigu.gulimall.product.service.BrandService;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

        //brandEntity.setName("华为");
        //brandService.save(brandEntity);
        //System.out.println("保存成功");
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("huawei");
//        brandService.updateById(brandEntity);
//        brandService.list(new QueryWrapper<BrandEntity>().eq("name", "华为")).forEach(System.out::println);

    }

}
