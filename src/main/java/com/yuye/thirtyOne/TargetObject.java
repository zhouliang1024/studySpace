package com.yuye.thirtyOne;

/**
 * 被代理的类
 * 目标对象类
 *
 * @Author yuye
 * @Date 2020/10/30 11:12 上午
 */
public class TargetObject {
    /**
     * 目标方法
     */
    public void business(){
        System.out.println("business");
    }
}
