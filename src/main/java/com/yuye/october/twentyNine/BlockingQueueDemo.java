package com.yuye.october.twentyNine;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author yuye
 * @Date 2020/10/29 9:56 下午
 */
public class BlockingQueueDemo {
    private static BlockingQueue<String> queue =new ArrayBlockingQueue<String>(5);
    private static class Producer extends Thread{
        @Override
        public void run() {
            try {
                queue.put("product");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("produce..");
        }
    }
    private static class Consumer extends Thread{
        @Override
        public void run() {
            String take="";
            try {
                take = queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("consume:"+take);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Producer producer = new Producer();
            producer.start();
        }
        for (int i = 0; i < 5; i++) {
            Consumer consumer = new Consumer();
            consumer.start();
        }
        for (int i = 0; i < 3; i++) {
            Producer producer = new Producer();
            producer.start();
        }
    }
}
