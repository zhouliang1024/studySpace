package com.yuye.october.twentyFive;

/**
 * @Author yuye
 * @Date 2020/10/25 10:11 下午
 */
public class ForkJoinDemo {
    private class Aa extends Thread{
        @Override
        public void run() {
            System.out.println("A");
        }
    }
    private class Bb extends Thread{
        private Aa aa;
        Bb(Aa a){
            this.aa=a;
        }
        @Override
        public void run() {
            try {
                aa.join();
                //b调用了a的join方法
                //b会等到a线程结束才会执行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }

    public void test(){
        Aa aa = new Aa();
        Bb bb = new Bb(aa);
        bb.start();
        aa.start();
    }
}
