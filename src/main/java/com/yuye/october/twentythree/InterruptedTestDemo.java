package com.yuye.october.twentythree;

/**
 * @Author yuye
 * @Date 2020/10/23 12:33 上午
 */
public class InterruptedTestDemo {
    public static void main(String[] args) {
        System.out.println("start========");
        InterruptedTest interruptedTest = new InterruptedTest();
        interruptedTest.start();
        interruptedTest.interrupt();
        System.out.println("end==========");
    }
}
