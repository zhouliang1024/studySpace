package com.yuye.october.twentyone;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author yuye
 * @Date 2020/10/21 12:46 上午
 */
public class ThreadStudy2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable());
        }

        executorService.shutdown();
        Thread thread = new Thread();
    }
}
