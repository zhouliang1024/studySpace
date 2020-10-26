package com.yuye.october.twentyFive;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yuye
 * @Date 2020/10/25 10:33 下午
 */
public class AwaitAndSignTest {
    public static void main(String[] args) {
        AwaitAndSignExample awaitAndSignExample = new AwaitAndSignExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->awaitAndSignExample.after());
        executorService.execute(()->awaitAndSignExample.before());
    }
}
