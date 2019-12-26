package cn.jbolt.common.model.base;
import cn.jbolt.base.JBoltBaseModel;

/**
 * Generated by JBolt, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseWechatMpinfo<M extends BaseWechatMpinfo<M>> extends JBoltBaseModel<M>{

	/**
	 * 主键
	 */
	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	/**
	 * 主键
	 */
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	 * 平台名称
	 */
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	/**
	 * 平台名称
	 */
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	 * 头像LOGO
	 */
	public M setLogo(java.lang.String logo) {
		set("logo", logo);
		return (M)this;
	}
	
	/**
	 * 头像LOGO
	 */
	public java.lang.String getLogo() {
		return getStr("logo");
	}

	/**
	 * 创建时间
	 */
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	/**
	 * 创建时间
	 */
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	 * 用户ID
	 */
	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}
	
	/**
	 * 用户ID
	 */
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	 * 是否启用
	 */
	public M setEnable(java.lang.Boolean enable) {
		set("enable", enable);
		return (M)this;
	}
	
	/**
	 * 是否启用
	 */
	public java.lang.Boolean getEnable() {
		return getBoolean("enable");
	}

	/**
	 * 创建时间
	 */
	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}
	
	/**
	 * 创建时间
	 */
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	/**
	 * 更新人ID
	 */
	public M setUpdateUserId(java.lang.Integer updateUserId) {
		set("update_user_id", updateUserId);
		return (M)this;
	}
	
	/**
	 * 更新人ID
	 */
	public java.lang.Integer getUpdateUserId() {
		return getInt("update_user_id");
	}

	/**
	 * 简介
	 */
	public M setBriefInfo(java.lang.String briefInfo) {
		set("brief_info", briefInfo);
		return (M)this;
	}
	
	/**
	 * 简介
	 */
	public java.lang.String getBriefInfo() {
		return getStr("brief_info");
	}

	/**
	 * 备注
	 */
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}
	
	/**
	 * 备注
	 */
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	 * 类型 订阅号、服务号、小程序、企业号
	 */
	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}
	
	/**
	 * 类型 订阅号、服务号、小程序、企业号
	 */
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	 * 是否已认证
	 */
	public M setIsAuthenticated(java.lang.Boolean isAuthenticated) {
		set("is_authenticated", isAuthenticated);
		return (M)this;
	}
	
	/**
	 * 是否已认证
	 */
	public java.lang.Boolean getIsAuthenticated() {
		return getBoolean("is_authenticated");
	}

	/**
	 * 申请认证主体的类型 个人还是企业
	 */
	public M setSubjectType(java.lang.Integer subjectType) {
		set("subject_type", subjectType);
		return (M)this;
	}
	
	/**
	 * 申请认证主体的类型 个人还是企业
	 */
	public java.lang.Integer getSubjectType() {
		return getInt("subject_type");
	}

	/**
	 * 微信号
	 */
	public M setWechatId(java.lang.String wechatId) {
		set("wechat_id", wechatId);
		return (M)this;
	}
	
	/**
	 * 微信号
	 */
	public java.lang.String getWechatId() {
		return getStr("wechat_id");
	}

	/**
	 * 二维码
	 */
	public M setQrcode(java.lang.String qrcode) {
		set("qrcode", qrcode);
		return (M)this;
	}
	
	/**
	 * 二维码
	 */
	public java.lang.String getQrcode() {
		return getStr("qrcode");
	}

}
