package com.sgcc.springdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * null
 * @author Caomingming  2021-10-09 09:44:25
 */
@Data
@TableName("u_user")
public class UUserEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户主键
	 */
	@TableId(value = "ID", type = IdType.INPUT)
	private String id;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 网省编码
	 */
	private String province;
	/**
	 * 地址_省市
	 */
	private String city;
	/**
	 * 地址_区县
	 */
	private String county;
	/**
	 * 注册来源01.微信小程序，02微信公众号，03支付宝生活号，04手机app，05网址网站
	 */
	private String registerSource;
	/**
	 * 注册时间
	 */
	private Date registerTime;
	/**
	 * 密码最后修改时间
	 */
	private Date passwordUpdateTime;
	/**
	 * 用户信息最后修改时间
	 */
	private Date lastUpdateTime;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 详细地址
	 */
	private String detailsAddr;
	/**
	 * 用户状态01.正在使用，02.销户
	 */
	private String status;
}
