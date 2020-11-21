package com.yuye.lamda;

import com.alibaba.druid.support.json.JSONUtils;
import com.google.common.base.Function;

import java.util.function.BiFunction;

/**
 * @Author: zhouliang
 * @Date: 2020/11/18 23:50
 */
public class TwoPoint {
    static class Simple{
        public String test(Integer num){
            return "test:"+num;
        }

        public String demo(){
            return "demo";
        }
    }

    public static void main(String[] args) {
        BiFunction<Simple, Integer, String> test = Simple::test;
        Simple simple = new Simple();
        String apply = test.apply(simple, 2);
        System.out.println(apply);
        Function<Simple, String> demo = Simple::demo;
        Simple t1 = new Simple();
        String apply1 = demo.apply(t1);
        System.out.println(apply1);
    }
}
