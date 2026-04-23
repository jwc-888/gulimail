package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jwc
 * @email 690684005@qq.com
 * @date 2026-04-23 16:31:24
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
