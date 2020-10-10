package com.yuye.basicdata;

/**
 * 关键字：final
 *
 * @Author yuye
 * @Date 2020/10/9 8:29 下午
 */
public class FinalDemo {
    public static void main(String[] args) {
        final int a=1; //基本数据类型不能被更改
        final Dog test = new Dog("test"); //引用类型，不能引用其它对象，但是被引用的对象本身是可以修改的。
        test.setName("ceshi");
        System.out.println(test.toString());
    }
}
