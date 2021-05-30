package com.yuye.thirtyOne;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author yuye
 * @Date 2020/10/30 11:14 上午
 */
public class MyInterceptor implements MethodInterceptor {

    private Object target;//目标类

    public MyInterceptor(Object target) {
        this.target = target;
    }
    //返回代理对象
    public Object createProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this); //回调函数 拦截器
        enhancer.setSuperclass(this.target.getClass());
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (true){
            System.out.println("切面方法");
            method.invoke(this.target,objects);//调用目标类的目标方法
            System.out.println("切面方法");
        }
        return null;
    }

}
