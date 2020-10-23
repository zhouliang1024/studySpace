package com.yuye.october.twentyFour;

/**
 * @Author yuye
 * @Date 2020/10/23 11:08 上午
 */
public class SynchronizeTest {
    public void func1(){
        synchronized (this){
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(" "+ i+" ");
            }
        }
    }
}
