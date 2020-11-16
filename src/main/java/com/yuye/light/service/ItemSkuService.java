package com.yuye.light.service;

import com.yuye.light.VO.ItemSkuReqVO;
import com.yuye.light.mbg.model.Itemsku;

import java.util.List;

/**
 * @Author: zhouliang
 * @Date: 2020/9/24 0:13
 */
public interface ItemSkuService {
    Itemsku getItemById (Long id);
    Itemsku getItemByExample (ItemSkuReqVO itemSkuReqVO);
    List<Itemsku> selectByExample(ItemSkuReqVO itemSkuReqVO);
    boolean addItem(Itemsku item);
    int updateItem(Itemsku itemsku);
    boolean deleteItemById(Long id);
    boolean deleteItemByItemId(Long itemId);

}
