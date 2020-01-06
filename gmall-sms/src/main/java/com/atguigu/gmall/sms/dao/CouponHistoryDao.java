package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author zhangyunchao
 * @email lxf@atguigu.com
 * @date 2020-01-06 10:39:35
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
