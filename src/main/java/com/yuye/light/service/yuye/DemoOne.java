package com.yuye.light.service.yuye;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 19:03
 */
public class DemoOne {

    public static void main(String[] args) {
        CatRun catRun = new CatRun();
        catRun.catDoRun((String name) ->{
                return false;
            });
    }
}
