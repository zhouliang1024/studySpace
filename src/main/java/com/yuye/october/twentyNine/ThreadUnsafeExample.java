package com.yuye.october.twentyNine;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yuye
 * @Date 2020/10/29 10:44 下午
 */
public class ThreadUnsafeExample {
    private int cnt=0;
    public void add(){
        cnt++;
    }
    private int get(){
        return this.cnt;
    }

    public static void main(String[] args) throws InterruptedException {
        final int threadSize=10000;
        ThreadUnsafeExample example = new ThreadUnsafeExample();
        CountDownLatch countDownLatch = new CountDownLatch(threadSize);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < threadSize; i++) {
            executorService.submit(()->{
                example.add();
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        System.out.println(example.get());
    }
}
