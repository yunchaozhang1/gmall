package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.BrandEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 品牌
 *
 * @author zhangyunchao
 * @email lxf@atguigu.com
 * @date 2020-01-04 16:55:49
 */
public interface BrandService extends IService<BrandEntity> {

    PageVo queryPage(QueryCondition params);
}

