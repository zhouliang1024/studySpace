package com.yuye.october.twentythree;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author yuye
 * @Date 2020/10/23 12:40 上午
 */
public class ShutdownTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        /*executorService.execute(()-> {
            try {
                Thread.sleep(3000);
                System.out.println("thread run=====");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });*/
        //executorService.shutdown(); 会让线程执行完，在中断
        //executorService.shutdownNow(); 直接中断正在运行中的线程
        //executorService.shutdownNow();
        System.out.println("main run====");
        Future<?> future = executorService.submit(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("中断一个线程=====");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        future.cancel(true);
        System.out.println("end====");
    }
}
