package com.yuye.staticData;

/**
 * @Author yuye
 * @Date 2020/10/10 1:55 下午
 */
public class StaticClz {
    //非静态内部类
    class InnerClass {
    }
    //静态内部类
    static class StaticInnerClass {
        //静态内部类不能访问外部类的非静态的方法和变量
    }

    public static void main(String[] args) {
        // InnerClass innerClass = new InnerClass(); // 'OuterClass.this' cannot be referenced from a static context
        StaticClz outerClass = new StaticClz();
        InnerClass innerClass = outerClass.new InnerClass();
        StaticInnerClass staticInnerClass = new StaticInnerClass();
    }
    //初始化顺序
    //静态变量和静态语句块优先于实例变量和普通语句块，静态变量和静态语句块的初始化顺序取决于它们在代码中的顺序。
    public static String staticField = "静态变量";

    static {
        System.out.println("静态语句块");
    }

    public String field = "实例变量";

    {
        System.out.println("普通语句块");
    }
    //最后才是构造函数的初始化
    public StaticClz() {
        System.out.println("构造函数");
    }


}
