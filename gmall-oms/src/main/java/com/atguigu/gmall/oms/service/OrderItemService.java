package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.OrderItemEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 订单项信息
 *
 * @author zhangyunchao
 * @email lxf@atguigu.com
 * @date 2020-01-06 10:07:45
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageVo queryPage(QueryCondition params);
}

