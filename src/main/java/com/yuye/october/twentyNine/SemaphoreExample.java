package com.yuye.october.twentyNine;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Author yuye
 * @Date 2020/10/29 9:39 下午
 */
public class SemaphoreExample {
    public static void main(String[] args) {
        final int clientCount=3;
        final int totalRequestCount=10;
        Semaphore semaphore = new Semaphore(clientCount);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalRequestCount; i++) {
            executorService.execute(()->{
                try {
                    semaphore.acquire();
                    System.out.print(semaphore.availablePermits()+"");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }

            });
        }
        executorService.shutdown();
    }
}
