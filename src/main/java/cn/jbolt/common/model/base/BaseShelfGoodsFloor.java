package cn.jbolt.common.model.base;
import cn.jbolt.base.JBoltBaseModel;

/**
 * Generated by JBolt, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseShelfGoodsFloor<M extends BaseShelfGoodsFloor<M>> extends JBoltBaseModel<M>{

	/**
	 * 主键ID
	 */
	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	/**
	 * 主键ID
	 */
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	 * 商品分组ID
	 */
	public M setGroupId(java.lang.Integer groupId) {
		set("group_id", groupId);
		return (M)this;
	}
	
	/**
	 * 商品分组ID
	 */
	public java.lang.Integer getGroupId() {
		return getInt("group_id");
	}

	/**
	 * 显示标题 默认是商品组的 可以改
	 */
	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}
	
	/**
	 * 显示标题 默认是商品组的 可以改
	 */
	public java.lang.String getTitle() {
		return getStr("title");
	}

	/**
	 * 打开地址
	 */
	public M setOpenUrl(java.lang.String openUrl) {
		set("open_url", openUrl);
		return (M)this;
	}
	
	/**
	 * 打开地址
	 */
	public java.lang.String getOpenUrl() {
		return getStr("open_url");
	}

	/**
	 * 显示商品数量
	 */
	public M setGoodsCount(java.lang.Integer goodsCount) {
		set("goods_count", goodsCount);
		return (M)this;
	}
	
	/**
	 * 显示商品数量
	 */
	public java.lang.Integer getGoodsCount() {
		return getInt("goods_count");
	}

	/**
	 * 显示几列布局
	 */
	public M setColumnCount(java.lang.Integer columnCount) {
		set("column_count", columnCount);
		return (M)this;
	}
	
	/**
	 * 显示几列布局
	 */
	public java.lang.Integer getColumnCount() {
		return getInt("column_count");
	}

	/**
	 * 排序
	 */
	public M setSortRank(java.lang.Integer sortRank) {
		set("sort_rank", sortRank);
		return (M)this;
	}
	
	/**
	 * 排序
	 */
	public java.lang.Integer getSortRank() {
		return getInt("sort_rank");
	}

	/**
	 * 货架ID
	 */
	public M setShelfId(java.lang.Integer shelfId) {
		set("shelf_id", shelfId);
		return (M)this;
	}
	
	/**
	 * 货架ID
	 */
	public java.lang.Integer getShelfId() {
		return getInt("shelf_id");
	}

	/**
	 * 货架元素ID
	 */
	public M setShelfElementId(java.lang.Integer shelfElementId) {
		set("shelf_element_id", shelfElementId);
		return (M)this;
	}
	
	/**
	 * 货架元素ID
	 */
	public java.lang.Integer getShelfElementId() {
		return getInt("shelf_element_id");
	}

}
