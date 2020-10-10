package com.yuye.staticData;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yuye
 * @Date 2020/10/10 4:10 下午
 */
class SuperClass {

//    子类方法的访问权限必须大于等于父类方法；
//    子类方法的返回类型必须是父类方法返回类型或为其子类型。
//    子类方法抛出的异常类型必须是父类抛出异常类型或为其子类型
//    子类方法访问权限为 public，大于父类的 protected。
//    子类的返回类型为 ArrayList，是父类返回类型 List 的子类。
//    子类抛出的异常类型为 Exception，是父类抛出异常 Throwable 的子类。
//    子类重写方法使用 @Override 注解，从而让编译器自动检查是否满足限制条件。

    protected List<Integer> func() throws Throwable {
        return new ArrayList<>();
    }
}

class SubClass extends SuperClass {
    @Override
    public ArrayList<Integer> func() throws Exception {
        return new ArrayList<>();
    }
}
