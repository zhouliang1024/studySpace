package com.yuye.light.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.yuye.light.VO.ItemSkuReqVO;
import com.yuye.light.mbg.model.Itemsku;
import com.yuye.light.mbg.model.ItemskuExample;
import com.yuye.light.service.ItemSkuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: zhouliang
 * @Date: 2020/9/24 0:44
 */
@Api(tags = "itemController",description = "商品管理中心")
@Controller
@RequestMapping("/item")
public class ItemSkuController {
    @Autowired
    private ItemSkuService itemSkuService;
    @ApiOperation("插入商品")
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody Itemsku itemsku){
        for (int i = 0; i <100 ; i++) {
        boolean b = itemSkuService.addItem(itemsku);
        }
        return "测试成功";
    }
    @ApiOperation("查询所有商品")
    @RequestMapping(value = "findItemList",method = RequestMethod.GET)
    @ResponseBody
    public String findAll(){
        ItemSkuReqVO itemskuExample = new ItemSkuReqVO();
        List<Itemsku> itemskus = itemSkuService.selectByExample(itemskuExample);
        return JSONUtils.toJSONString(itemskus);
    }
}
