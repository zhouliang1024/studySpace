package com.yuye.october.twentythree;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yuye
 * @Date 2020/10/23 12:11 上午
 */
public class ExecutorTest {
    public static void main(String[] args) {
        //1.CachedThreadPool  一个任务创建一个进程
        //2.FixedThreadPool     所有任务只能使用固定大小的进程
        //3.SingleThreadPool    相当于一个大小的FixedThreadPool
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Thread1());
        }
        executorService.shutdown();
    }
}
