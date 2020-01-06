package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author zhangyunchao
 * @email lxf@atguigu.com
 * @date 2020-01-06 10:39:35
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}
