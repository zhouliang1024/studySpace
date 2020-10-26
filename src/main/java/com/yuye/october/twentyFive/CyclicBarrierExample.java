package com.yuye.october.twentyFive;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yuye
 * @Date 2020/10/25 11:02 下午
 */
public class CyclicBarrierExample {
    public static void main(String[] args) {
        final int totalThread=10;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            executorService.execute(()->{
                System.out.println("before.."+cyclicBarrier.getNumberWaiting());
                try {
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("end..");
            });
        }
        executorService.shutdown();
    }
}
