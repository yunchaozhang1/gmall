package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangyunchao
 * @email lxf@atguigu.com
 * @date 2020-01-04 16:55:49
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
