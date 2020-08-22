package com.learning.gulimall.member.dao;

import com.learning.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author vivi
 * @email vivi@gmail.com
 * @date 2020-08-22 17:57:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
