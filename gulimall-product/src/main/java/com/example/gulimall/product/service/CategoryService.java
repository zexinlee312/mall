package com.example.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gulimall.common.utils.PageUtils;
import com.example.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * ÉÌÆ·Èý¼¶·ÖÀà
 *
 * @author lee
 * @email 234518384@qq.com
 * @date 2023-09-11 22:33:36
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

