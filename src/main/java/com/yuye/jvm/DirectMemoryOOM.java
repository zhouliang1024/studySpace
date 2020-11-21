package com.yuye.jvm;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Author: zhouliang
 * @Date: 2020/11/19 0:28
 */
public class DirectMemoryOOM {
    private static final int INT_1MB= 1024*1024;

    public static void main(String[] args) throws Exception {
        Field declaredField = Unsafe.class.getDeclaredFields()[0];
        declaredField.setAccessible(true);
        Unsafe unsafe=(Unsafe)declaredField.get(null);
        while (true){
            unsafe.allocateMemory(INT_1MB);
        }
    }
}
