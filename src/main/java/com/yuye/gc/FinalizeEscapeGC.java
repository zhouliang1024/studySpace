package com.yuye.gc;

/**
 * @Author: zhouliang
 * @Date: 2020/11/21 17:12
 */
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOKE= null;
    public void alive (){
        System.out.println("yes, i am still alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed ");
        FinalizeEscapeGC.SAVE_HOKE= this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOKE=new FinalizeEscapeGC();

        //对象第一次成功拯救自己
        SAVE_HOKE=null;
        System.gc();
        //finzalizer方法优先级很低
        Thread.sleep(500);
        if (SAVE_HOKE != null){
            SAVE_HOKE.alive();
        }else {
            System.out.println("no.i am dead");
        }

        SAVE_HOKE=null;
        System.gc();
        //finzalizer方法优先级很低
        Thread.sleep(500);
        if (SAVE_HOKE != null){
            SAVE_HOKE.alive();
        }else {
            System.out.println("no.i am dead");
        }

    }
}
