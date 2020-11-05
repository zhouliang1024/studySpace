package com.yuye.october.twentyNine;

/**
 * @Author yuye
 * @Date 2020/10/30 12:12 上午
 */
public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        Thread thread = new Thread(()->{
            threadLocal.set(1);
            threadLocal.set(12);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadLocal.get());
            threadLocal.remove();
        });

        Thread thread1 = new Thread(()->{
            String x = (String) threadLocal.get();
            threadLocal.set(2);
            threadLocal.set(300);
            System.out.println("thread2.."+threadLocal.get());
            threadLocal.remove();

        });
        thread.start();
        thread1.start();
    }
}
