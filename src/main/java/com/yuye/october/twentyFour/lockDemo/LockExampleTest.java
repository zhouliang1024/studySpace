package com.yuye.october.twentyFour.lockDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yuye
 * @Date 2020/10/23 11:38 上午
 */
public class LockExampleTest {
    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{
            lockExample.fun();
        });
        executorService.execute(()->{
            lockExample.fun();
        });
        executorService.shutdown();
    }
}
