package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jwc
 * @email 690684005@qq.com
 * @date 2026-04-23 16:02:13
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
