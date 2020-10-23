package com.yuye.october.twentythree;

/**
 * @Author yuye
 * @Date 2020/10/23 12:29 上午
 */
public class InterruptedTest extends Thread {
    @Override
    public synchronized void run() {
        //如果线程中断，该方法会返回true
        while (!interrupted()){
            System.out.println("循环");
        }
        System.out.println("thread shutdown");
    }
}
