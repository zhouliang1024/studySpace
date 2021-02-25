package com.yuye.chain;

/**
 * @Author yuye
 * @Date 2021/2/26 12:51 上午
 */
public class DepartmentManager extends Handler {
    @Override
    public boolean approve(double day) {
        if(day<5){
            System.out.println("部门经理审批通过");
            return true;
        }else {
            System.out.println("部门经理传给了他的上司");
            return getHandler().approve(day);
        }
    }

}
