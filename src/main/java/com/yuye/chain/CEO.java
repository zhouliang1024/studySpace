package com.yuye.chain;

/**
 * @Author yuye
 * @Date 2021/2/26 12:52 上午
 */
public class CEO extends Handler {

    @Override
    public boolean approve(double day) {
        System.out.println("ceo审批通过");
        return true;

    }
}
