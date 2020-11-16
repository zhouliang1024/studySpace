package com.yuye.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouliang
 * @Date: 2020/11/16 23:21
 */
public class OutOfMemory {
    static class HeapOOM {

    }
    public static void main(String[] args) {
        List<HeapOOM> list = new ArrayList<>();
        while (true) {
            list.add(new HeapOOM());
        }
    }
}
