package com.example.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gulimall.common.utils.PageUtils;
import com.example.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * ÉÌÆ·ÆÀ¼Û»Ø¸´¹ØÏµ
 *
 * @author lee
 * @email 234518384@qq.com
 * @date 2023-09-11 22:33:37
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

