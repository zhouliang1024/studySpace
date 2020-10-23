package com.yuye.october.twentyone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author yuye
 * @Date 2020/10/21 12:08 上午
 */
public class Study1 {
    public static void main(String[] args) {
        List<String> arrays = new CopyOnWriteArrayList<>();
        arrays.add("线程安全");
        System.out.println(arrays.toString());
        List<Long> list = new ArrayList<>();
        List<Long> threadSafeList = Collections.synchronizedList(list);
        threadSafeList.add(12315L);
        System.out.println(threadSafeList.toString());
    }
}
