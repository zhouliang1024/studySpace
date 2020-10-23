package com.yuye.october.twentythree;

/**
 * @Author yuye
 * @Date 2020/10/23 12:08 上午
 */
public class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
