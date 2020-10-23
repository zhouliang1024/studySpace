package com.yuye.october.twentyone;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author yuye
 * @Date 2020/10/21 12:37 上午
 */
public class ThreadStudy1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableOne callableOne = new CallableOne();
        FutureTask<String> ft = new FutureTask<>(callableOne);
        new Thread(ft).start();
        System.out.println(ft.get());

        new Thread(()-> {
            System.out.println("测试线程");
        }).start();
    }
}
