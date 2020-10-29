package com.yuye.october.twentySeven;

/**
 * 陷阱
 *
 * @Author yuye
 * @Date 2020/10/27 11:50 下午
 */
public class Trap implements Observer {
    @Override
    public void update() {
        if (inRange()){
            System.out.println("主角被陷入了陷阱");
        }
    }

    private boolean inRange() {
        //判断主角是否在陷阱范围内
        return true;
    }
}
