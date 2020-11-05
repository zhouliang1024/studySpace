package com.yuye.october.twentyNine;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author yuye
 * @Date 2020/10/29 11:43 下午
 */
public class AtomicExampleDemo {
    private AtomicInteger cnt=new AtomicInteger();
    public void add(){
        cnt.incrementAndGet();
    }
    public int get(){
        return this.cnt.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final int threadSize=10000;
        AtomicExampleDemo atomicExampleDemo = new AtomicExampleDemo();
        CountDownLatch countDownLatch = new CountDownLatch(threadSize);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < threadSize; i++) {
            executorService.submit(()->{
                atomicExampleDemo.add();
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        System.out.println(atomicExampleDemo.get());
    }
}
