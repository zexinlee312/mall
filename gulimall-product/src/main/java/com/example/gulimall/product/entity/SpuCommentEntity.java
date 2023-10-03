package com.example.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÉÌÆ·ÆÀ¼Û
 * 
 * @author lee
 * @email 234518384@qq.com
 * @date 2023-09-11 22:33:37
 */
@Data
@TableName("pms_spu_comment")
public class SpuCommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * ÉÌÆ·Ãû×Ö
	 */
	private String spuName;
	/**
	 * »áÔ±êÇ³Æ
	 */
	private String memberNickName;
	/**
	 * ÐÇ¼¶
	 */
	private Integer star;
	/**
	 * »áÔ±ip
	 */
	private String memberIp;
	/**
	 * ´´½¨Ê±¼ä
	 */
	private Date createTime;
	/**
	 * ÏÔÊ¾×´Ì¬[0-²»ÏÔÊ¾£¬1-ÏÔÊ¾]
	 */
	private Integer showStatus;
	/**
	 * ¹ºÂòÊ±ÊôÐÔ×éºÏ
	 */
	private String spuAttributes;
	/**
	 * µãÔÞÊý
	 */
	private Integer likesCount;
	/**
	 * »Ø¸´Êý
	 */
	private Integer replyCount;
	/**
	 * ÆÀÂÛÍ¼Æ¬/ÊÓÆµ[jsonÊý¾Ý£»[{type:ÎÄ¼þÀàÐÍ,url:×ÊÔ´Â·¾¶}]]
	 */
	private String resources;
	/**
	 * ÄÚÈÝ
	 */
	private String content;
	/**
	 * ÓÃ»§Í·Ïñ
	 */
	private String memberIcon;
	/**
	 * ÆÀÂÛÀàÐÍ[0 - ¶ÔÉÌÆ·µÄÖ±½ÓÆÀÂÛ£¬1 - ¶ÔÆÀÂÛµÄ»Ø¸´]
	 */
	private Integer commentType;

}
