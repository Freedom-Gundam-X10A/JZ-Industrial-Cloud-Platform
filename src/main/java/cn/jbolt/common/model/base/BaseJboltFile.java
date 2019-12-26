package cn.jbolt.common.model.base;
import cn.jbolt.base.JBoltBaseModel;

/**
 * Generated by JBolt, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseJboltFile<M extends BaseJboltFile<M>> extends JBoltBaseModel<M>{

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	 * 保存物理地址
	 */
	public M setLocalPath(java.lang.String localPath) {
		set("local_path", localPath);
		return (M)this;
	}
	
	/**
	 * 保存物理地址
	 */
	public java.lang.String getLocalPath() {
		return getStr("local_path");
	}

	/**
	 * 本地可访问URL地址
	 */
	public M setLocalUrl(java.lang.String localUrl) {
		set("local_url", localUrl);
		return (M)this;
	}
	
	/**
	 * 本地可访问URL地址
	 */
	public java.lang.String getLocalUrl() {
		return getStr("local_url");
	}

	/**
	 * 外部CDN地址
	 */
	public M setCdnUrl(java.lang.String cdnUrl) {
		set("cdn_url", cdnUrl);
		return (M)this;
	}
	
	/**
	 * 外部CDN地址
	 */
	public java.lang.String getCdnUrl() {
		return getStr("cdn_url");
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
	 * 文件名
	 */
	public M setFileName(java.lang.String fileName) {
		set("file_name", fileName);
		return (M)this;
	}
	
	/**
	 * 文件名
	 */
	public java.lang.String getFileName() {
		return getStr("file_name");
	}

	/**
	 * 文件类型 图片 附件 视频 音频
	 */
	public M setFileType(java.lang.Integer fileType) {
		set("file_type", fileType);
		return (M)this;
	}
	
	/**
	 * 文件类型 图片 附件 视频 音频
	 */
	public java.lang.Integer getFileType() {
		return getInt("file_type");
	}

	/**
	 * 文件大小
	 */
	public M setFileSize(java.lang.Long fileSize) {
		set("file_size", fileSize);
		return (M)this;
	}
	
	/**
	 * 文件大小
	 */
	public java.lang.Long getFileSize() {
		return getLong("file_size");
	}

	/**
	 * 后缀名
	 */
	public M setFileSuffix(java.lang.String fileSuffix) {
		set("file_suffix", fileSuffix);
		return (M)this;
	}
	
	/**
	 * 后缀名
	 */
	public java.lang.String getFileSuffix() {
		return getStr("file_suffix");
	}

}