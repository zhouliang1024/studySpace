package com.yuye.october.twentyFive;

/**
 * @Author yuye
 * @Date 2020/10/25 10:21 下午
 */
public class WaitNotifyExample {
    public synchronized void notifyWay(){
        System.out.println("before");
        notifyAll();
    }
    public synchronized void waitWay(){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }
}
