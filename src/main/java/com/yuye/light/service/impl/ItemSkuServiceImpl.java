package com.yuye.light.service.impl;

import com.yuye.light.VO.ItemSkuReqVO;
import com.yuye.light.mbg.mapper.ItemskuMapper;
import com.yuye.light.mbg.model.Itemsku;
import com.yuye.light.mbg.model.ItemskuExample;
import com.yuye.light.service.ItemSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhouliang
 * @Date: 2020/9/24 0:14
 */
@Service
public class ItemSkuServiceImpl implements ItemSkuService {
    @Autowired
    private ItemskuMapper itemskuMapper;

    @Override
    public Itemsku getItemById(Long id) {
        return itemskuMapper.selectByPrimaryKey(id);
    }

    @Override
    public Itemsku getItemByExample(ItemSkuReqVO itemSkuReqVO) {
        return null;
    }

    @Override
    public List<Itemsku> selectByExample(ItemSkuReqVO itemSkuReqVO) {
        ItemskuExample itemskuExample = new ItemskuExample();
        itemskuExample.setDistinct(true);
        return itemskuMapper.selectByExample(itemskuExample);
    }

    @Override
    public boolean addItem(Itemsku item) {
        return itemskuMapper.insert(item) > 0;
    }

    @Override
    public int updateItem(Itemsku itemsku) {
        return itemskuMapper.updateByPrimaryKey(itemsku);
    }

    @Override
    public boolean deleteItemById(Long id) {
        return itemskuMapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public boolean deleteItemByItemId(Long itemId) {
        return false;
    }
}
