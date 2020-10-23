package com.yuye.staticData;

/**
 * @Author yuye
 * @Date 2020/10/10 5:08 下午
 */
public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(1);
        System.out.println(integerBox.get());
    }
}
