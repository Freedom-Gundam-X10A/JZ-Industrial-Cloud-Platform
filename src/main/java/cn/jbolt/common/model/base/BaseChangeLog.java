package cn.jbolt.common.model.base;
import cn.jbolt.base.JBoltBaseModel;

/**
 * Generated by JBolt, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseChangeLog<M extends BaseChangeLog<M>> extends JBoltBaseModel<M>{

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}
	
	public java.lang.String getContent() {
		return getStr("content");
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
	 * jbolt版本ID
	 */
	public M setJboltVersionId(java.lang.Integer jboltVersionId) {
		set("jbolt_version_id", jboltVersionId);
		return (M)this;
	}
	
	/**
	 * jbolt版本ID
	 */
	public java.lang.Integer getJboltVersionId() {
		return getInt("jbolt_version_id");
	}

}
