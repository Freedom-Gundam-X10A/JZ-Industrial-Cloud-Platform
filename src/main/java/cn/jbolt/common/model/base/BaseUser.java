package cn.jbolt.common.model.base;
import cn.jbolt.base.JBoltBaseModel;

/**
 * Generated by JBolt, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseUser<M extends BaseUser<M>> extends JBoltBaseModel<M>{

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
	 * 用户名
	 */
	public M setUsername(java.lang.String username) {
		set("username", username);
		return (M)this;
	}
	
	/**
	 * 用户名
	 */
	public java.lang.String getUsername() {
		return getStr("username");
	}

	public M setPassword(java.lang.String password) {
		set("password", password);
		return (M)this;
	}
	
	public java.lang.String getPassword() {
		return getStr("password");
	}

	/**
	 * 姓名
	 */
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	/**
	 * 姓名
	 */
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	 * 头像
	 */
	public M setAvatar(java.lang.String avatar) {
		set("avatar", avatar);
		return (M)this;
	}
	
	/**
	 * 头像
	 */
	public java.lang.String getAvatar() {
		return getStr("avatar");
	}

	/**
	 * 记录创建时间
	 */
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	/**
	 * 记录创建时间
	 */
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	 * 手机号
	 */
	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}
	
	/**
	 * 手机号
	 */
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	/**
	 * 启用
	 */
	public M setEnable(java.lang.Boolean enable) {
		set("enable", enable);
		return (M)this;
	}
	
	/**
	 * 启用
	 */
	public java.lang.Boolean getEnable() {
		return getBoolean("enable");
	}

	/**
	 * 性别
	 */
	public M setSex(java.lang.Integer sex) {
		set("sex", sex);
		return (M)this;
	}
	
	/**
	 * 性别
	 */
	public java.lang.Integer getSex() {
		return getInt("sex");
	}

	public M setPinyin(java.lang.String pinyin) {
		set("pinyin", pinyin);
		return (M)this;
	}
	
	public java.lang.String getPinyin() {
		return getStr("pinyin");
	}

	/**
	 * 角色 一对多
	 */
	public M setRoles(java.lang.String roles) {
		set("roles", roles);
		return (M)this;
	}
	
	/**
	 * 角色 一对多
	 */
	public java.lang.String getRoles() {
		return getStr("roles");
	}

	/**
	 * 是否系统超级管理员
	 */
	public M setIsSystemAdmin(java.lang.Boolean isSystemAdmin) {
		set("is_system_admin", isSystemAdmin);
		return (M)this;
	}
	
	/**
	 * 是否系统超级管理员
	 */
	public java.lang.Boolean getIsSystemAdmin() {
		return getBoolean("is_system_admin");
	}

	/**
	 * 创建人
	 */
	public M setCreateUserId(java.lang.Integer createUserId) {
		set("create_user_id", createUserId);
		return (M)this;
	}
	
	/**
	 * 创建人
	 */
	public java.lang.Integer getCreateUserId() {
		return getInt("create_user_id");
	}

}