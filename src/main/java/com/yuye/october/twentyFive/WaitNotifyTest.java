package com.yuye.october.twentyFive;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yuye
 * @Date 2020/10/25 10:23 下午
 */
public class WaitNotifyTest {
    public static void main(String[] args) {
        WaitNotifyExample waitNotifyExample = new WaitNotifyExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->waitNotifyExample.waitWay());
        executorService.execute(()->waitNotifyExample.notifyWay());
    }
}
