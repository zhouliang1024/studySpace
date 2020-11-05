package com.yuye.elevenFive.callback;

/**
 * @Author yuye
 * @Date 2020/11/5 4:34 下午
 */
public class Tina extends Employee{
    @Override
    public void finishWork(CallBackDemo callBackDemo) {
        System.out.println("Tina开始完成任务");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callBackDemo.report(666);
    }
}
