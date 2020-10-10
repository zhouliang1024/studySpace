package com.yuye.staticData;

import java.util.HashSet;

/**
 * @Author yuye
 * @Date 2020/10/10 2:41 下午
 */
public class EqualExampleTest {
    public static void main(String[] args) {
        EqualExample e1 = new EqualExample(1, 1, 1);
        EqualExample e2 = new EqualExample(1, 1, 1);
        System.out.println(e1.equals(e2)); // true
        HashSet<EqualExample> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        System.out.println(set.size());   // 2
    }
}
