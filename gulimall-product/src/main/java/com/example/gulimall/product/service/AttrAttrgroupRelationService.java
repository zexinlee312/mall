package com.example.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gulimall.common.utils.PageUtils;
import com.example.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * ÊôÐÔ&ÊôÐÔ·Ö×é¹ØÁª
 *
 * @author lee
 * @email 234518384@qq.com
 * @date 2023-09-11 22:33:37
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

