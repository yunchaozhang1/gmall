package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.OrderEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 订单
 *
 * @author zhangyunchao
 * @email lxf@atguigu.com
 * @date 2020-01-06 10:07:45
 */
public interface OrderService extends IService<OrderEntity> {

    PageVo queryPage(QueryCondition params);
}

