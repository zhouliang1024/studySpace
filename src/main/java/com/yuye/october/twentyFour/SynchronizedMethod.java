package com.yuye.october.twentyFour;

/**
 * @Author yuye
 * @Date 2020/10/23 11:16 上午
 */
public class SynchronizedMethod {
    public synchronized void fun2(){
        for (int i = 0; i <20 ; i++) {
            try {
                Thread.sleep(20);
                System.out.print(" "+i+" ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
