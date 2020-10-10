package com.yuye.basicdata;

/**
 * @Author yuye
 * @Date 2020/10/9 5:57 下午
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        Integer a = new Integer(2);
        Integer b = new Integer(2);
        System.out.println(a==b);
        Integer c = Integer.valueOf(2);
        Integer d = Integer.valueOf(2);
        System.out.println(a.equals(b));
        String ad="acd";
        String intern = ad.intern();//字符串常量池
        System.out.println(intern);
    }
}
