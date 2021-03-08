package com.yuye.chain;

/**
 * @Author yuye
 * @Date 2021/2/26 12:49 上午
 */
public class GroupLeader extends Handler {
    @Override
    public boolean approve(double day) {
        if (day<0.5){
            System.out.println("小组长审批通过");
            return true;
        }else {
            System.out.println("小组长传给了他的上司");
            System.out.println("=========");
            return getHandler().approve(day);
        }
    }
}
