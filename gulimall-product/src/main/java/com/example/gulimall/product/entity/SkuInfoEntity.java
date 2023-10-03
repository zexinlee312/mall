package com.example.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * skuÐÅÏ¢
 * 
 * @author lee
 * @email 234518384@qq.com
 * @date 2023-09-11 22:33:37
 */
@Data
@TableName("pms_sku_info")
public class SkuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * skuId
	 */
	@TableId
	private Long skuId;
	/**
	 * spuId
	 */
	private Long spuId;
	/**
	 * skuÃû³Æ
	 */
	private String skuName;
	/**
	 * sku½éÉÜÃèÊö
	 */
	private String skuDesc;
	/**
	 * ËùÊô·ÖÀàid
	 */
	private Long catalogId;
	/**
	 * Æ·ÅÆid
	 */
	private Long brandId;
	/**
	 * Ä¬ÈÏÍ¼Æ¬
	 */
	private String skuDefaultImg;
	/**
	 * ±êÌâ
	 */
	private String skuTitle;
	/**
	 * ¸±±êÌâ
	 */
	private String skuSubtitle;
	/**
	 * ¼Û¸ñ
	 */
	private BigDecimal price;
	/**
	 * ÏúÁ¿
	 */
	private Long saleCount;

}
