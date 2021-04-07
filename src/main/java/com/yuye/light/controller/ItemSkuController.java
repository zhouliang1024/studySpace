package com.yuye.light.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.yuye.light.VO.ItemSkuReqVO;
import com.yuye.light.mbg.model.Itemsku;
import com.yuye.light.service.ItemSkuService;
import com.yuye.light.service.pipeline.Cat;
import com.yuye.light.service.pipeline.Dog;
import com.yuye.light.service.pipeline.Pipeline;
import com.yuye.light.service.pipeline.PipelineFactory;
import com.yuye.light.service.strtategy.AnimalStrategy;
import com.yuye.light.observer.ListenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private AnimalStrategy animalStrategy;

    @Autowired
    private PipelineFactory pipelineFactory;

    @Autowired
    private ListenService listenService;

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

    @ApiOperation("查询animal")
    @ResponseBody
    @RequestMapping(value = "findAnimall",method = RequestMethod.GET)
    public String getName(@RequestParam("code") String code){
        Pipeline<Cat> catPipeline = pipelineFactory.getCatPipeline(code);
        if (catPipeline !=null) {
            Cat cat = new Cat();
            cat.setAge(1);
            cat.setEventType("a");
            cat.setName("猫");
            boolean invoke1 = catPipeline.invoke(cat);
        }
        Pipeline<Dog> dogPipeline = pipelineFactory.getDogPipeline(code);
        if (dogPipeline!=null) {
            Dog dog = new Dog();
            dog.setAge(2);
            dog.setEventType("z");
            dog.setName("狗");
            boolean invoke = dogPipeline.invoke(dog);
        }
        return "success";
    }

    @ApiOperation("查询所有商品")
    @RequestMapping(value = "listen",method = RequestMethod.GET)
    @ResponseBody
    public String testObserver(){
        listenService.enventTest();
        return "success";
    }
}
