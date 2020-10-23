package com.yuye.october.twentythree;

/**
 * @Author yuye
 * @Date 2020/10/23 12:26 上午
 */
public class InterruptTest {
    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();
        System.out.println("start========");
        thread2.start();
        thread2.interrupt();
        System.out.println("end==========");
    }
}
