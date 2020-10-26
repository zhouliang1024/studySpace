package com.yuye.october.twentyFive;

/**
 * @Author yuye
 * @Date 2020/10/25 11:01 下午
 */
public class CyclicBarrier {
    private int parties;
    private int count;
    private Runnable barrierCommand;
    public CyclicBarrier(int parties, Runnable barrierAction) {
        if (parties <= 0) throw new IllegalArgumentException();
        this.parties = parties;
        this.count = parties;
        this.barrierCommand = barrierAction;
    }

    public CyclicBarrier(int parties) {
        this(parties, null);
    }

}
