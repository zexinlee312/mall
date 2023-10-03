package com.example.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gulimall.common.utils.PageUtils;
import com.example.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * ÓÅ»ÝÈ¯ÁìÈ¡ÀúÊ·¼ÇÂ¼
 *
 * @author lee
 * @email 234518384@qq.com
 * @date 2023-09-17 23:00:58
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

