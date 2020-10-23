package com.yuye.october.twentyFour;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yuye
 * @Date 2020/10/23 11:26 上午
 */
public class SynchronizeClazzTest {
    public static void main(String[] args) {
        SynchronizeClazz synchronizeClazz = new SynchronizeClazz();
        SynchronizeClazz synchronizeClazz1 = new SynchronizeClazz();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{
            synchronizeClazz.fun2();
        });
        executorService.execute(()->{
            synchronizeClazz1.fun2();
        });
        executorService.shutdown();
    }
}
