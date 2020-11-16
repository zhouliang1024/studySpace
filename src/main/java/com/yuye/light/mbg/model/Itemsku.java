package com.yuye.light.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

import java.io.Serializable;

public class Itemsku implements Serializable {
    /**
     * skuID
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "主键id")
    private Long id;

    /**
     * sku编码
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "sku编码")
    private String skucode;

    /**
     * 商品ID
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "商品ID")
    private Long itemid;

    /**
     * sku图片
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "sku图片")
    private String image;

    /**
     * 零售价格,以分为单位
     *
     * @mbggenerated
     */
    private Long saleprice;

    /**
     * 建议零售价,以分为单位
     *
     * @mbggenerated
     */
    private Long recommendsaleprice;

    /**
     * 是否默认sku
     *
     * @mbggenerated
     */
    private Byte defaultsku;

    /**
     * 重量(g)
     *
     * @mbggenerated
     */
    private Integer weight;

    /**
     * 体积(cm3)
     *
     * @mbggenerated
     */
    private Integer volume;

    /**
     * sku额外信息
     *
     * @mbggenerated
     */
    private String extra;

    /**
     * 是否删除 0 否 1 是
     *
     * @mbggenerated
     */
    private Byte isdeleted;

    /**
     * 创建人
     *
     * @mbggenerated
     */
    private Long creatorid;

    /**
     * 更新人
     *
     * @mbggenerated
     */
    private Long modifierid;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Long created;

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    private Long updated;

    /**
     * sku属性集合
     *
     * @mbggenerated
     */
    private String properties;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkucode() {
        return skucode;
    }

    public void setSkucode(String skucode) {
        this.skucode = skucode;
    }

    public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(Long saleprice) {
        this.saleprice = saleprice;
    }

    public Long getRecommendsaleprice() {
        return recommendsaleprice;
    }

    public void setRecommendsaleprice(Long recommendsaleprice) {
        this.recommendsaleprice = recommendsaleprice;
    }

    public Byte getDefaultsku() {
        return defaultsku;
    }

    public void setDefaultsku(Byte defaultsku) {
        this.defaultsku = defaultsku;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Byte getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Byte isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Long getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(Long creatorid) {
        this.creatorid = creatorid;
    }

    public Long getModifierid() {
        return modifierid;
    }

    public void setModifierid(Long modifierid) {
        this.modifierid = modifierid;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skucode=").append(skucode);
        sb.append(", itemid=").append(itemid);
        sb.append(", image=").append(image);
        sb.append(", saleprice=").append(saleprice);
        sb.append(", recommendsaleprice=").append(recommendsaleprice);
        sb.append(", defaultsku=").append(defaultsku);
        sb.append(", weight=").append(weight);
        sb.append(", volume=").append(volume);
        sb.append(", extra=").append(extra);
        sb.append(", isdeleted=").append(isdeleted);
        sb.append(", creatorid=").append(creatorid);
        sb.append(", modifierid=").append(modifierid);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", properties=").append(properties);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}