package com.yuye.october.twentyNine;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author yuye
 * @Date 2020/10/29 9:48 下午
 */
public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<>(()->{
            int start=0;
            for (int i = 0; i < 100; i++) {
                Thread.sleep(30);
                start+=i;
            }
            return start;
        });
        Thread thread = new Thread(futureTask);
        thread.start();
        Thread otherThread = new Thread(() -> {
            System.out.println("other thread is run");
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        otherThread.start();
        System.out.println(futureTask.get());


    }
}
