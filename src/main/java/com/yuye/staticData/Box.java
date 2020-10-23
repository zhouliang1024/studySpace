package com.yuye.staticData;

/**
 * @Author yuye
 * @Date 2020/10/10 5:07 下午
 */
public class Box<T> {
    // T stands for "Type"
    private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }
}

