/*
package com.yuye.observer;

import com.alibaba.druid.support.json.JSONUtils;
import com.yuye.light.VO.ItemSkuReqVO;
import com.yuye.light.mbg.model.Itemsku;
import com.yuye.light.service.ItemSkuService;
import com.yuye.light.service.pipeline.Cat;
import com.yuye.light.service.pipeline.Dog;
import com.yuye.light.service.pipeline.Pipeline;
import com.yuye.light.service.pipeline.PipelineFactory;
import com.yuye.light.service.strtategy.AnimalStrategy;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

*/
/**
 * @Author: zhouliang
 * @Date: 2020/9/24 0:44
 *//*

@Api(tags = "observerController",description = "observer")
@Controller
@RequestMapping("/observer")
public class ObserverController {
    @Autowired
    private ListenService listenService;

    @ApiOperation("查询所有商品")
    @RequestMapping(value = "listen",method = RequestMethod.GET)
    @ResponseBody
    public String findAll(){
        listenService.enventTest();
        return "success";
    }
}
*/
