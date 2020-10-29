package com.yuye.october.twentySeven;

/**
 * 怪物
 *
 * @Author yuye
 * @Date 2020/10/27 11:47 下午
 */
public class Master implements Observer {

    @Override
    public void update() {
        if (inRange()){
            System.out.println("怪物 对主角进行了攻击");
        }
    }

    private boolean inRange() {
        //判断主角是否在自己的影响范围内
        return true;
    }
}
