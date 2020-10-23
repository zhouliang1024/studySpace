package com.yuye.october.twentyFour;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yuye
 * @Date 2020/10/23 11:18 上午
 */
public class SynchronizedMethodDemo {
    public static void main(String[] args) {
        SynchronizedMethod synchronizedMethod = new SynchronizedMethod();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{
            synchronizedMethod.fun2();
        });
        executorService.execute(()->{
            synchronizedMethod.fun2();
        });
        executorService.shutdown();
    }
}
