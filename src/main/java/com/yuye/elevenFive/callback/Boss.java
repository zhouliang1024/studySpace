package com.yuye.elevenFive.callback;

/**
 * @Author yuye
 * @Date 2020/11/5 4:28 下午
 */
public class Boss implements CallBackDemo {
    public void issuedTask(Employee employee){
        System.out.println("老板下达了任务");
        employee.finishWork(this);
    }
    @Override
    public void report(int num) {
        System.out.println("员工反馈信息："+num);
    }
}
