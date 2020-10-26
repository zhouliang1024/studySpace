package com.yuye.october.twentyFive;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author yuye
 * @Date 2020/10/25 10:29 下午
 */
public class AwaitAndSignExample {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void before(){
        lock.lock();
        try {
            System.out.println("before");
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void after(){
        lock.lock();
        try {
            condition.await();
            System.out.println("after");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
