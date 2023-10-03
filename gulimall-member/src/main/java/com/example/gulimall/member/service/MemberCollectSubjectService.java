package com.example.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.gulimall.common.utils.PageUtils;
import com.example.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * »áÔ±ÊÕ²ØµÄ×¨Ìâ»î¶¯
 *
 * @author lee
 * @email 234518384@qq.com
 * @date 2023-09-17 23:17:38
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

