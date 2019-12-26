package cn.jbolt.common.model.base;
import cn.jbolt.base.JBoltBaseModel;

/**
 * Generated by JBolt, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseGoods<M extends BaseGoods<M>> extends JBoltBaseModel<M>{

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

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	 * 单价
	 */
	public M setPrice(java.math.BigDecimal price) {
		set("price", price);
		return (M)this;
	}
	
	/**
	 * 单价
	 */
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	/**
	 * 原价
	 */
	public M setOriginalPrice(java.math.BigDecimal originalPrice) {
		set("original_price", originalPrice);
		return (M)this;
	}
	
	/**
	 * 原价
	 */
	public java.math.BigDecimal getOriginalPrice() {
		return get("original_price");
	}

	/**
	 * 主图
	 */
	public M setMainImage(java.lang.String mainImage) {
		set("main_image", mainImage);
		return (M)this;
	}
	
	/**
	 * 主图
	 */
	public java.lang.String getMainImage() {
		return getStr("main_image");
	}

	/**
	 * 附图
	 */
	public M setExtraImages(java.lang.String extraImages) {
		set("extra_images", extraImages);
		return (M)this;
	}
	
	/**
	 * 附图
	 */
	public java.lang.String getExtraImages() {
		return getStr("extra_images");
	}

	/**
	 * 商品描述类型
	 */
	public M setContentType(java.lang.Integer contentType) {
		set("content_type", contentType);
		return (M)this;
	}
	
	/**
	 * 商品描述类型
	 */
	public java.lang.Integer getContentType() {
		return getInt("content_type");
	}

	/**
	 * 商品组ID
	 */
	public M setGroups(java.lang.String groups) {
		set("groups", groups);
		return (M)this;
	}
	
	/**
	 * 商品组ID
	 */
	public java.lang.String getGroups() {
		return getStr("groups");
	}

	/**
	 * 库存量
	 */
	public M setStockCount(java.lang.Integer stockCount) {
		set("stock_count", stockCount);
		return (M)this;
	}
	
	/**
	 * 库存量
	 */
	public java.lang.Integer getStockCount() {
		return getInt("stock_count");
	}

	/**
	 * 二级标题
	 */
	public M setSubTitle(java.lang.String subTitle) {
		set("sub_title", subTitle);
		return (M)this;
	}
	
	/**
	 * 二级标题
	 */
	public java.lang.String getSubTitle() {
		return getStr("sub_title");
	}

	/**
	 * 是否是多规格
	 */
	public M setIsMultispec(java.lang.Boolean isMultispec) {
		set("is_multispec", isMultispec);
		return (M)this;
	}
	
	/**
	 * 是否是多规格
	 */
	public java.lang.Boolean getIsMultispec() {
		return getBoolean("is_multispec");
	}

	/**
	 * 限购数量 0=不限制
	 */
	public M setLimitCount(java.lang.Integer limitCount) {
		set("limit_count", limitCount);
		return (M)this;
	}
	
	/**
	 * 限购数量 0=不限制
	 */
	public java.lang.Integer getLimitCount() {
		return getInt("limit_count");
	}

	/**
	 * 所在地
	 */
	public M setLocationLabel(java.lang.String locationLabel) {
		set("location_label", locationLabel);
		return (M)this;
	}
	
	/**
	 * 所在地
	 */
	public java.lang.String getLocationLabel() {
		return getStr("location_label");
	}

	/**
	 * 是否提供发票
	 */
	public M setIsProvideInvoices(java.lang.Boolean isProvideInvoices) {
		set("is_provide_invoices", isProvideInvoices);
		return (M)this;
	}
	
	/**
	 * 是否提供发票
	 */
	public java.lang.Boolean getIsProvideInvoices() {
		return getBoolean("is_provide_invoices");
	}

	/**
	 * 是否保修
	 */
	public M setIsGuarantee(java.lang.Boolean isGuarantee) {
		set("is_guarantee", isGuarantee);
		return (M)this;
	}
	
	/**
	 * 是否保修
	 */
	public java.lang.Boolean getIsGuarantee() {
		return getBoolean("is_guarantee");
	}

	/**
	 * 是否上架
	 */
	public M setOnSale(java.lang.Boolean onSale) {
		set("on_sale", onSale);
		return (M)this;
	}
	
	/**
	 * 是否上架
	 */
	public java.lang.Boolean getOnSale() {
		return getBoolean("on_sale");
	}

	/**
	 * 下架时间
	 */
	public M setUnderTime(java.util.Date underTime) {
		set("under_time", underTime);
		return (M)this;
	}
	
	/**
	 * 下架时间
	 */
	public java.util.Date getUnderTime() {
		return get("under_time");
	}

	/**
	 * 上架处理人
	 */
	public M setOnSaleUserId(java.lang.Integer onSaleUserId) {
		set("on_sale_user_id", onSaleUserId);
		return (M)this;
	}
	
	/**
	 * 上架处理人
	 */
	public java.lang.Integer getOnSaleUserId() {
		return getInt("on_sale_user_id");
	}

	/**
	 * 上架时间
	 */
	public M setOnSaleTime(java.util.Date onSaleTime) {
		set("on_sale_time", onSaleTime);
		return (M)this;
	}
	
	/**
	 * 上架时间
	 */
	public java.util.Date getOnSaleTime() {
		return get("on_sale_time");
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
	 * 更新时间
	 */
	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}
	
	/**
	 * 更新时间
	 */
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	/**
	 * 更新人
	 */
	public M setUpdateUserId(java.lang.Integer updateUserId) {
		set("update_user_id", updateUserId);
		return (M)this;
	}
	
	/**
	 * 更新人
	 */
	public java.lang.Integer getUpdateUserId() {
		return getInt("update_user_id");
	}

	/**
	 * 商品单位
	 */
	public M setGoodsUnit(java.lang.Integer goodsUnit) {
		set("goods_unit", goodsUnit);
		return (M)this;
	}
	
	/**
	 * 商品单位
	 */
	public java.lang.Integer getGoodsUnit() {
		return getInt("goods_unit");
	}

	/**
	 * 真实销量
	 */
	public M setRealSaleCount(java.lang.Integer realSaleCount) {
		set("real_sale_count", realSaleCount);
		return (M)this;
	}
	
	/**
	 * 真实销量
	 */
	public java.lang.Integer getRealSaleCount() {
		return getInt("real_sale_count");
	}

	/**
	 * 展示营销销量
	 */
	public M setShowSaleCount(java.lang.Integer showSaleCount) {
		set("show_sale_count", showSaleCount);
		return (M)this;
	}
	
	/**
	 * 展示营销销量
	 */
	public java.lang.Integer getShowSaleCount() {
		return getInt("show_sale_count");
	}

	/**
	 * 商品类型
	 */
	public M setTypeId(java.lang.Integer typeId) {
		set("type_id", typeId);
		return (M)this;
	}
	
	/**
	 * 商品类型
	 */
	public java.lang.Integer getTypeId() {
		return getInt("type_id");
	}

	/**
	 * 商品品牌
	 */
	public M setBrandId(java.lang.Integer brandId) {
		set("brand_id", brandId);
		return (M)this;
	}
	
	/**
	 * 商品品牌
	 */
	public java.lang.Integer getBrandId() {
		return getInt("brand_id");
	}

	/**
	 * 热销
	 */
	public M setIsHot(java.lang.Boolean isHot) {
		set("is_hot", isHot);
		return (M)this;
	}
	
	/**
	 * 热销
	 */
	public java.lang.Boolean getIsHot() {
		return getBoolean("is_hot");
	}

	/**
	 * 推荐
	 */
	public M setIsRecommend(java.lang.Boolean isRecommend) {
		set("is_recommend", isRecommend);
		return (M)this;
	}
	
	/**
	 * 推荐
	 */
	public java.lang.Boolean getIsRecommend() {
		return getBoolean("is_recommend");
	}

	/**
	 * 前台分类KEY
	 */
	public M setFcategoryKey(java.lang.String fcategoryKey) {
		set("fcategory_key", fcategoryKey);
		return (M)this;
	}
	
	/**
	 * 前台分类KEY
	 */
	public java.lang.String getFcategoryKey() {
		return getStr("fcategory_key");
	}

	/**
	 * 后台分类KEY
	 */
	public M setBcategoryKey(java.lang.String bcategoryKey) {
		set("bcategory_key", bcategoryKey);
		return (M)this;
	}
	
	/**
	 * 后台分类KEY
	 */
	public java.lang.String getBcategoryKey() {
		return getStr("bcategory_key");
	}

	/**
	 * 后端分类ID
	 */
	public M setBcategoryId(java.lang.Integer bcategoryId) {
		set("bcategory_id", bcategoryId);
		return (M)this;
	}
	
	/**
	 * 后端分类ID
	 */
	public java.lang.Integer getBcategoryId() {
		return getInt("bcategory_id");
	}

	/**
	 * 前端分类ID
	 */
	public M setFcategoryId(java.lang.Integer fcategoryId) {
		set("fcategory_id", fcategoryId);
		return (M)this;
	}
	
	/**
	 * 前端分类ID
	 */
	public java.lang.Integer getFcategoryId() {
		return getInt("fcategory_id");
	}

	/**
	 * 下架处理人
	 */
	public M setUnderUserId(java.lang.Integer underUserId) {
		set("under_user_id", underUserId);
		return (M)this;
	}
	
	/**
	 * 下架处理人
	 */
	public java.lang.Integer getUnderUserId() {
		return getInt("under_user_id");
	}

	/**
	 * 是否已删除
	 */
	public M setIsDelete(java.lang.Boolean isDelete) {
		set("is_delete", isDelete);
		return (M)this;
	}
	
	/**
	 * 是否已删除
	 */
	public java.lang.Boolean getIsDelete() {
		return getBoolean("is_delete");
	}

	/**
	 * 商品编号
	 */
	public M setGoodsNo(java.lang.String goodsNo) {
		set("goods_no", goodsNo);
		return (M)this;
	}
	
	/**
	 * 商品编号
	 */
	public java.lang.String getGoodsNo() {
		return getStr("goods_no");
	}

}
