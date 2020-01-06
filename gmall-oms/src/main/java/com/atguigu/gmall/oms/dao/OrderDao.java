package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhangyunchao
 * @email lxf@atguigu.com
 * @date 2020-01-06 10:07:45
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
