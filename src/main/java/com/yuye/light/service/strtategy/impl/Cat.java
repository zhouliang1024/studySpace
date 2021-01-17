package com.yuye.light.service.strtategy.impl;


import com.yuye.light.service.strtategy.AnimalService;
import com.yuye.light.service.strtategy.StrategyEnum;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 14:13
 */
@Service
public class Cat implements AnimalService {
    @Override
    public String showName(String name) {
        return "小猫名："+name;
    }

    @Override
    public int getCode() {
        return StrategyEnum.CAT.getCode();
    }
}
