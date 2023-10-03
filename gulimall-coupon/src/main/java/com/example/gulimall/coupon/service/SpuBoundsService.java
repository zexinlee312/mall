package com.example.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gulimall.common.utils.PageUtils;
import com.example.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * ÉÌÆ·spu»ý·ÖÉèÖÃ
 *
 * @author lee
 * @email 234518384@qq.com
 * @date 2023-09-17 23:00:58
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

