package com.yuye.october.twentyNine;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * @Author yuye
 * @Date 2020/10/29 10:24 下午
 */
public class ForkJoinDemo extends RecursiveTask<Integer> {
    private static final int threshold=5;
    private int first;
    private int last;

    public ForkJoinDemo(int first, int last) {
        this.first = first;
        this.last = last;
    }


    @Override
    protected Integer compute() {
        int result=0;
        if (last-first >= 5){
            for (int i = first; i <last ; i++) {
                result+=i;
            }
        } else {
            int middle= first+(first+last)/2;
            ForkJoinDemo left = new ForkJoinDemo(first, middle);
            ForkJoinDemo right = new ForkJoinDemo(middle + 1, last);
            left.fork();
            right.fork();
            result = left.join()+right.join();
        }

        return result;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinDemo forkJoinDemo = new ForkJoinDemo(1, 10000);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Future task = forkJoinPool.submit(forkJoinDemo);
        System.out.println(task.get());
        int num=0;
        for (int i = 1; i <10000 ; i++) {
            num+=i;
        }
        System.out.println(num);
    }
}
