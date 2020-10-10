package com.yuye.basicdata;

/**
 * @Author yuye
 * @Date 2020/10/9 8:40 下午
 */
public class Cat {
    private int age; //实例变量  每创建一个实例就会产生一个实例变量，它与该实例同生共死。
    private static int foods; //静态变量  也就是说这个变量属于类的，类所有的实例都共享静态变量，可以直接通过类名来访问它。静态变量在内存中只存在一份。

    //静态方法在类加载的时候就存在了，它不依赖于任何实例(只能访问所属类的静态字段和静态方法，方法中不能有 this 和 super 关键字，因此这两个关键字与具体对象关联。)。所以静态方法必须有实现，也就是说它不能是抽象方法
    public static void func1(){
    }
}
