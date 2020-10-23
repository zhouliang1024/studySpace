package com.yuye.october.twentythree;

/**
 * @Author yuye
 * @Date 2020/10/23 12:07 上午
 */
public class Thread1Test {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread thread = new Thread(thread1);
        //thread.setDaemon(true);
        thread.start();
        Thread2 thread2 = new Thread2();
        Thread tr = new Thread(thread2);
        try {
            Thread.sleep(3000);
            System.out.println("线程睡眠3s");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
