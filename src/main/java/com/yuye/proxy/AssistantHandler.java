package com.yuye.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author yuye
 * @Date 2021/2/25 11:34 下午
 */
public class AssistantHandler implements InvocationHandler {
    /**
     * 目标对象
     */
    private Object targetObject;

    public Object createProxy(Object targetObject){
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("递给领导");
        result = method.invoke(this.targetObject, args);
        System.out.println("装入袋子，送出");
        return result;
    }
}
