package com.example.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gulimall.common.utils.PageUtils;
import com.example.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * ¶©µ¥ÏîÐÅÏ¢
 *
 * @author lee
 * @email 234518384@qq.com
 * @date 2023-09-17 23:21:26
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

