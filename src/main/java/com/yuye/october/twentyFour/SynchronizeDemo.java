package com.yuye.october.twentyFour;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yuye
 * @Date 2020/10/23 11:09 上午
 */
public class SynchronizeDemo {
    public static void main(String[] args) {
        SynchronizeTest synchronizeTest = new SynchronizeTest();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{
            synchronizeTest.func1();
        });
        executorService.execute(()->{
            synchronizeTest.func1();
        });
        executorService.shutdown();
    }
}
