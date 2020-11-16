package com.yuye.jvm;

/**
 * @Author: zhouliang
 * @Date: 2020/11/17 0:26
 */
public class JavaVMStackOOM {
    private void dontStop(){
        while (true) {

        }
    }
    public void stackLeakByThread () {
        while (true) {
            Thread thread = new Thread(()->{
                dontStop();
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM javaVMStackOOM = new JavaVMStackOOM();
        javaVMStackOOM.stackLeakByThread();
    }
}
