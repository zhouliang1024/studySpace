package com.yuye.jvm;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: zhouliang
 * @Date: 2020/11/18 23:59
 */
public class RunTimeConstantPoolOOM {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i =0;
        while (true){
            set.add(String.valueOf(i++).intern());
        }
    }
}
