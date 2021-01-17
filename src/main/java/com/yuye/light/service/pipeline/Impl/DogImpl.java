package com.yuye.light.service.pipeline.Impl;

import com.yuye.light.service.pipeline.Dog;
import com.yuye.light.service.pipeline.Pipeline;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 17:28
 */
@Service
public class DogImpl extends Pipeline<Dog> {
    @Override
    public boolean invoke(Dog dog) {
        System.out.println(String.format("狗执行了:%s",dog.toString()));
        return super.invoke(dog);
    }

    @Override
    public String attachedEvent() {
        return "z";
    }
}
