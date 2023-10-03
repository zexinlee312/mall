package com.example.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * »áÔ±
 * 
 * @author lee
 * @email 234518384@qq.com
 * @date 2023-09-17 23:17:38
 */
@Data
@TableName("ums_member")
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * »áÔ±µÈ¼¶id
	 */
	private Long levelId;
	/**
	 * ÓÃ»§Ãû
	 */
	private String username;
	/**
	 * ÃÜÂë
	 */
	private String password;
	/**
	 * êÇ³Æ
	 */
	private String nickname;
	/**
	 * ÊÖ»úºÅÂë
	 */
	private String mobile;
	/**
	 * ÓÊÏä
	 */
	private String email;
	/**
	 * Í·Ïñ
	 */
	private String header;
	/**
	 * ÐÔ±ð
	 */
	private Integer gender;
	/**
	 * ÉúÈÕ
	 */
	private Date birth;
	/**
	 * ËùÔÚ³ÇÊÐ
	 */
	private String city;
	/**
	 * Ö°Òµ
	 */
	private String job;
	/**
	 * ¸öÐÔÇ©Ãû
	 */
	private String sign;
	/**
	 * ÓÃ»§À´Ô´
	 */
	private Integer sourceType;
	/**
	 * »ý·Ö
	 */
	private Integer integration;
	/**
	 * ³É³¤Öµ
	 */
	private Integer growth;
	/**
	 * ÆôÓÃ×´Ì¬
	 */
	private Integer status;
	/**
	 * ×¢²áÊ±¼ä
	 */
	private Date createTime;

}
