package com.yuye.basicdata;

/**
 * @Author yuye
 * @Date 2020/10/9 7:41 下午
 */
public class StringDemo {
    public static void main(String[] args) {
        String aaa = new String("aaa"); //会创建两个字符串对象 1、stringPoll 2、new 会在堆里面创建一个对象
        String aaa1 = new String("aaa");
        System.out.println(aaa==aaa1);
        System.out.println(aaa.equals(aaa1));
        String bbb="bbb";//自动将字符串放入stringPool
        String ddd="bbb";
        System.out.println(bbb==ddd);
        String intern = aaa.intern();
        String intern1 = aaa.intern();
        System.out.println(intern==intern1);
        Dog dog = new Dog("");
        System.out.println(dog instanceof Animal);
    }
}
