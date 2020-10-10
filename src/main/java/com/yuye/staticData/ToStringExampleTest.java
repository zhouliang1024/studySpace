package com.yuye.staticData;

/**
 * @Author yuye
 * @Date 2020/10/10 2:54 下午
 */
public class ToStringExampleTest {
    public static void main(String[] args) {
        ToStringExample example = new ToStringExample(123);
        //com.yuye.staticData.ToStringExample@5fd0d5ae 后面的数值为散列码的无符号十六进制表示。
        System.out.println(example.toString());
        System.out.println(example.hashCode());
    }
}
