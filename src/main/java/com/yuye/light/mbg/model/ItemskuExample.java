package com.yuye.light.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class ItemskuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemskuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSkucodeIsNull() {
            addCriterion("skuCode is null");
            return (Criteria) this;
        }

        public Criteria andSkucodeIsNotNull() {
            addCriterion("skuCode is not null");
            return (Criteria) this;
        }

        public Criteria andSkucodeEqualTo(String value) {
            addCriterion("skuCode =", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeNotEqualTo(String value) {
            addCriterion("skuCode <>", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeGreaterThan(String value) {
            addCriterion("skuCode >", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeGreaterThanOrEqualTo(String value) {
            addCriterion("skuCode >=", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeLessThan(String value) {
            addCriterion("skuCode <", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeLessThanOrEqualTo(String value) {
            addCriterion("skuCode <=", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeLike(String value) {
            addCriterion("skuCode like", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeNotLike(String value) {
            addCriterion("skuCode not like", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeIn(List<String> values) {
            addCriterion("skuCode in", values, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeNotIn(List<String> values) {
            addCriterion("skuCode not in", values, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeBetween(String value1, String value2) {
            addCriterion("skuCode between", value1, value2, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeNotBetween(String value1, String value2) {
            addCriterion("skuCode not between", value1, value2, "skucode");
            return (Criteria) this;
        }

        public Criteria andItemidIsNull() {
            addCriterion("itemId is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("itemId is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(Long value) {
            addCriterion("itemId =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(Long value) {
            addCriterion("itemId <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(Long value) {
            addCriterion("itemId >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(Long value) {
            addCriterion("itemId >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(Long value) {
            addCriterion("itemId <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(Long value) {
            addCriterion("itemId <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<Long> values) {
            addCriterion("itemId in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<Long> values) {
            addCriterion("itemId not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(Long value1, Long value2) {
            addCriterion("itemId between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(Long value1, Long value2) {
            addCriterion("itemId not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNull() {
            addCriterion("salePrice is null");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNotNull() {
            addCriterion("salePrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalepriceEqualTo(Long value) {
            addCriterion("salePrice =", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotEqualTo(Long value) {
            addCriterion("salePrice <>", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThan(Long value) {
            addCriterion("salePrice >", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThanOrEqualTo(Long value) {
            addCriterion("salePrice >=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThan(Long value) {
            addCriterion("salePrice <", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThanOrEqualTo(Long value) {
            addCriterion("salePrice <=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceIn(List<Long> values) {
            addCriterion("salePrice in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotIn(List<Long> values) {
            addCriterion("salePrice not in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceBetween(Long value1, Long value2) {
            addCriterion("salePrice between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotBetween(Long value1, Long value2) {
            addCriterion("salePrice not between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andRecommendsalepriceIsNull() {
            addCriterion("recommendSalePrice is null");
            return (Criteria) this;
        }

        public Criteria andRecommendsalepriceIsNotNull() {
            addCriterion("recommendSalePrice is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendsalepriceEqualTo(Long value) {
            addCriterion("recommendSalePrice =", value, "recommendsaleprice");
            return (Criteria) this;
        }

        public Criteria andRecommendsalepriceNotEqualTo(Long value) {
            addCriterion("recommendSalePrice <>", value, "recommendsaleprice");
            return (Criteria) this;
        }

        public Criteria andRecommendsalepriceGreaterThan(Long value) {
            addCriterion("recommendSalePrice >", value, "recommendsaleprice");
            return (Criteria) this;
        }

        public Criteria andRecommendsalepriceGreaterThanOrEqualTo(Long value) {
            addCriterion("recommendSalePrice >=", value, "recommendsaleprice");
            return (Criteria) this;
        }

        public Criteria andRecommendsalepriceLessThan(Long value) {
            addCriterion("recommendSalePrice <", value, "recommendsaleprice");
            return (Criteria) this;
        }

        public Criteria andRecommendsalepriceLessThanOrEqualTo(Long value) {
            addCriterion("recommendSalePrice <=", value, "recommendsaleprice");
            return (Criteria) this;
        }

        public Criteria andRecommendsalepriceIn(List<Long> values) {
            addCriterion("recommendSalePrice in", values, "recommendsaleprice");
            return (Criteria) this;
        }

        public Criteria andRecommendsalepriceNotIn(List<Long> values) {
            addCriterion("recommendSalePrice not in", values, "recommendsaleprice");
            return (Criteria) this;
        }

        public Criteria andRecommendsalepriceBetween(Long value1, Long value2) {
            addCriterion("recommendSalePrice between", value1, value2, "recommendsaleprice");
            return (Criteria) this;
        }

        public Criteria andRecommendsalepriceNotBetween(Long value1, Long value2) {
            addCriterion("recommendSalePrice not between", value1, value2, "recommendsaleprice");
            return (Criteria) this;
        }

        public Criteria andDefaultskuIsNull() {
            addCriterion("defaultSku is null");
            return (Criteria) this;
        }

        public Criteria andDefaultskuIsNotNull() {
            addCriterion("defaultSku is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultskuEqualTo(Byte value) {
            addCriterion("defaultSku =", value, "defaultsku");
            return (Criteria) this;
        }

        public Criteria andDefaultskuNotEqualTo(Byte value) {
            addCriterion("defaultSku <>", value, "defaultsku");
            return (Criteria) this;
        }

        public Criteria andDefaultskuGreaterThan(Byte value) {
            addCriterion("defaultSku >", value, "defaultsku");
            return (Criteria) this;
        }

        public Criteria andDefaultskuGreaterThanOrEqualTo(Byte value) {
            addCriterion("defaultSku >=", value, "defaultsku");
            return (Criteria) this;
        }

        public Criteria andDefaultskuLessThan(Byte value) {
            addCriterion("defaultSku <", value, "defaultsku");
            return (Criteria) this;
        }

        public Criteria andDefaultskuLessThanOrEqualTo(Byte value) {
            addCriterion("defaultSku <=", value, "defaultsku");
            return (Criteria) this;
        }

        public Criteria andDefaultskuIn(List<Byte> values) {
            addCriterion("defaultSku in", values, "defaultsku");
            return (Criteria) this;
        }

        public Criteria andDefaultskuNotIn(List<Byte> values) {
            addCriterion("defaultSku not in", values, "defaultsku");
            return (Criteria) this;
        }

        public Criteria andDefaultskuBetween(Byte value1, Byte value2) {
            addCriterion("defaultSku between", value1, value2, "defaultsku");
            return (Criteria) this;
        }

        public Criteria andDefaultskuNotBetween(Byte value1, Byte value2) {
            addCriterion("defaultSku not between", value1, value2, "defaultsku");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Integer value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Integer value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Integer value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Integer value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Integer> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Integer> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Integer value1, Integer value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andExtraIsNull() {
            addCriterion("extra is null");
            return (Criteria) this;
        }

        public Criteria andExtraIsNotNull() {
            addCriterion("extra is not null");
            return (Criteria) this;
        }

        public Criteria andExtraEqualTo(String value) {
            addCriterion("extra =", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotEqualTo(String value) {
            addCriterion("extra <>", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThan(String value) {
            addCriterion("extra >", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThanOrEqualTo(String value) {
            addCriterion("extra >=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThan(String value) {
            addCriterion("extra <", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThanOrEqualTo(String value) {
            addCriterion("extra <=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLike(String value) {
            addCriterion("extra like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotLike(String value) {
            addCriterion("extra not like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraIn(List<String> values) {
            addCriterion("extra in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotIn(List<String> values) {
            addCriterion("extra not in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraBetween(String value1, String value2) {
            addCriterion("extra between", value1, value2, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotBetween(String value1, String value2) {
            addCriterion("extra not between", value1, value2, "extra");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("isDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("isDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Byte value) {
            addCriterion("isDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Byte value) {
            addCriterion("isDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Byte value) {
            addCriterion("isDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("isDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Byte value) {
            addCriterion("isDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Byte value) {
            addCriterion("isDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Byte> values) {
            addCriterion("isDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Byte> values) {
            addCriterion("isDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Byte value1, Byte value2) {
            addCriterion("isDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("isDeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNull() {
            addCriterion("creatorId is null");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNotNull() {
            addCriterion("creatorId is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoridEqualTo(Long value) {
            addCriterion("creatorId =", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotEqualTo(Long value) {
            addCriterion("creatorId <>", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThan(Long value) {
            addCriterion("creatorId >", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThanOrEqualTo(Long value) {
            addCriterion("creatorId >=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThan(Long value) {
            addCriterion("creatorId <", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThanOrEqualTo(Long value) {
            addCriterion("creatorId <=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIn(List<Long> values) {
            addCriterion("creatorId in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotIn(List<Long> values) {
            addCriterion("creatorId not in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridBetween(Long value1, Long value2) {
            addCriterion("creatorId between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotBetween(Long value1, Long value2) {
            addCriterion("creatorId not between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andModifieridIsNull() {
            addCriterion("modifierId is null");
            return (Criteria) this;
        }

        public Criteria andModifieridIsNotNull() {
            addCriterion("modifierId is not null");
            return (Criteria) this;
        }

        public Criteria andModifieridEqualTo(Long value) {
            addCriterion("modifierId =", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotEqualTo(Long value) {
            addCriterion("modifierId <>", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridGreaterThan(Long value) {
            addCriterion("modifierId >", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridGreaterThanOrEqualTo(Long value) {
            addCriterion("modifierId >=", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridLessThan(Long value) {
            addCriterion("modifierId <", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridLessThanOrEqualTo(Long value) {
            addCriterion("modifierId <=", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridIn(List<Long> values) {
            addCriterion("modifierId in", values, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotIn(List<Long> values) {
            addCriterion("modifierId not in", values, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridBetween(Long value1, Long value2) {
            addCriterion("modifierId between", value1, value2, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotBetween(Long value1, Long value2) {
            addCriterion("modifierId not between", value1, value2, "modifierid");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Long value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Long value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Long value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Long value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Long value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Long value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Long> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Long> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Long value1, Long value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Long value1, Long value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Long value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Long value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Long value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Long value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Long value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Long value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Long> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Long> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Long value1, Long value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Long value1, Long value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}