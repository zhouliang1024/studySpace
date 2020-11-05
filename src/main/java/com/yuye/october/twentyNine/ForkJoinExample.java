package com.yuye.october.twentyNine;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * @Author yuye
 * @Date 2020/10/29 10:07 下午
 */
public class ForkJoinExample extends RecursiveTask<Integer> {
    private final int threshold=5;
    private int first;
    private int last;

    public ForkJoinExample (int first,int last){
        this.first=first;
        this.last=last;
    }

    @Override
    protected Integer compute() {
        int result=0;
        if (last-first <= threshold){
            for (int i = first; i <last ; i++) {
                result+=i;
            }
        } else {
            //拆分小任务
            int middle = first +(last - first)/2;
            ForkJoinExample leftTask = new ForkJoinExample(first, middle);
            ForkJoinExample rightTask = new ForkJoinExample(middle + 1, last);
            leftTask.fork();
            rightTask.fork();
            result=leftTask.join()+rightTask.join();

        }
        return result;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long st = System.currentTimeMillis();
        ForkJoinExample forkJoinExample = new ForkJoinExample(1, 1000000);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Future result=forkJoinPool.submit(forkJoinExample);
        //System.out.println(result.get());
        /*
        int result=0;
        for (int i = 1; i <1000000 ; i++) {
            result+=i;
        }*/
        long end= System.currentTimeMillis();
        System.out.println(result+"time:"+String.valueOf(end-st));
    }

}
