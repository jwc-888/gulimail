package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 品牌分类关联
 * 
 * @author jwc
 * @email 690684005@qq.com
 * @date 2026-04-22 17:36:54
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
    void updateCategory(@Param("catId") Long catId, @Param("name") String name);
}
