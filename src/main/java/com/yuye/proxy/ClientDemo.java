package com.yuye.proxy;

import java.lang.reflect.Proxy;

/**
 * 测试类
 *
 * @Author yuye
 * @Date 2021/2/25 11:52 下午
 */
public class ClientDemo {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        Assistant leaderProxy = new Assistant(ceo);
        leaderProxy.sign();
        System.out.println("=======================");

        AssistantHandler ah = new AssistantHandler();
        Leader leader2 = (Leader) ah.createProxy(new CEO());
        leader2.sign();


//        Leader leader = (Leader)Proxy.newProxyInstance(CEO.class.getClassLoader(), ceo.getClass().getInterfaces(), ah);
//        leader.sign();

//        Leader leader4 = (Leader) Proxy.newProxyInstance(Leader.class.getClassLoader(),
//                new Class[] { Leader.class },
//                ah);
//        leader4.sign();
    }
}
