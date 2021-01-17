/*
package com.yuye.light.service.strtategy;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

*/
/**
 * @Author: zhouliang
 * @Date: 2021/1/17 14:32
 *//*

@Api(tags = "animalController",description = "animal")
@Controller
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    private AnimalStrategy animalStrategy;

    @ApiOperation("animal")
    @ResponseBody
    @RequestMapping(value = "findAnimall",method = RequestMethod.GET)
    public String getName(@RequestParam("code") Integer code, @RequestParam("name") String name){
        AnimalService animal = animalStrategy.getAnimal(code);
        return animal.showName(name);
    }
}
*/
