package com.example.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gulimall.common.utils.PageUtils;
import com.example.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * Æ·ÅÆ·ÖÀà¹ØÁª
 *
 * @author lee
 * @email 234518384@qq.com
 * @date 2023-09-11 22:33:37
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

