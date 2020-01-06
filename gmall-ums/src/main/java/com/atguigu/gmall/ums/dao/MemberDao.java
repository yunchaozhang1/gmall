package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangyunchao
 * @email lxf@atguigu.com
 * @date 2020-01-06 11:40:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
