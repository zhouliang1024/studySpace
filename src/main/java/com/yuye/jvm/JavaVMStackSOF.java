package com.yuye.jvm;

/**
 * @Author: zhouliang
 * @Date: 2020/11/17 0:08
 */
public class JavaVMStackSOF {
    private int stackLength = 1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Exception e) {
            System.out.println("stack length:"+oom.stackLength);
            throw e;
        }

    }
}
