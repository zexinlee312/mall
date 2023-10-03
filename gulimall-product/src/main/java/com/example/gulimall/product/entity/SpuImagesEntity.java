package com.example.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuÍ¼Æ¬
 * 
 * @author lee
 * @email 234518384@qq.com
 * @date 2023-09-11 22:33:37
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * Í¼Æ¬Ãû
	 */
	private String imgName;
	/**
	 * Í¼Æ¬µØÖ·
	 */
	private String imgUrl;
	/**
	 * Ë³Ðò
	 */
	private Integer imgSort;
	/**
	 * ÊÇ·ñÄ¬ÈÏÍ¼
	 */
	private Integer defaultImg;

}
