package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SpuFullReductionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品满减信息
 *
 * @author zhangyunchao
 * @email lxf@atguigu.com
 * @date 2020-01-06 10:39:35
 */
public interface SpuFullReductionService extends IService<SpuFullReductionEntity> {

    PageVo queryPage(QueryCondition params);
}

