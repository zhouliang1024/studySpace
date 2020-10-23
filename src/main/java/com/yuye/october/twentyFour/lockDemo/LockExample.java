package com.yuye.october.twentyFour.lockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author yuye
 * @Date 2020/10/23 11:32 上午
 */
public class LockExample {
    private Lock  lock= new ReentrantLock();
    public void fun(){
        lock.lock();
        try {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(" "+i+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock(); //确保释放锁，以避免死锁
        }
    }
}
