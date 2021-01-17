package com.yuye.light.service.strtategy.impl;


import com.yuye.light.service.strtategy.AnimalService;
import com.yuye.light.service.strtategy.StrategyEnum;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 14:15
 */
@Service
public class Dog implements AnimalService {
    @Override
    public String showName(String name) {
        return "狗："+name;
    }

    @Override
    public int getCode() {
        return StrategyEnum.DOG.getCode();
    }
}
