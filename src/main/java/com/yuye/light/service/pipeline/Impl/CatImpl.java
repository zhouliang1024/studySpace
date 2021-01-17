package com.yuye.light.service.pipeline.Impl;

import com.yuye.light.service.pipeline.Cat;
import com.yuye.light.service.pipeline.Pipeline;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 17:03
 */
@Service
public class CatImpl extends Pipeline<Cat> {

    @Override
    public boolean invoke(Cat cat) {
        System.out.println(String.format("cat执行了:%s",cat.toString()));
        return super.invoke(cat);
    }

    @Override
    public String attachedEvent() {
        return "a";
    }
}
