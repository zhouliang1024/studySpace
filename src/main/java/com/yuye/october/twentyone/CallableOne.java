package com.yuye.october.twentyone;

import java.util.concurrent.Callable;

/**
 * @Author yuye
 * @Date 2020/10/21 12:37 上午
 */
public class CallableOne implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "one thread";
    }
}
