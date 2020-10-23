package com.yuye.october.twentyFour;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yuye
 * @Date 2020/10/23 11:13 上午
 */
public class SunchronizeDemo2 {
    public static void main(String[] args) {
        SynchronizeTest synchronizeTest = new SynchronizeTest();
        SynchronizeTest synchronizeTest1 = new SynchronizeTest();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{
            synchronizeTest.func1();
        });
        executorService.execute(()->{
            synchronizeTest1.func1();
        });
    }
}
