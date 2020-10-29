package com.yuye.october.twentySeven.observer;

/**
 * @Author yuye
 * @Date 2020/10/28 12:03 上午
 */
public class Monster implements ObserverClz {
    @Override
    public void update() {
        if (inRange()){
            System.out.println("主角收到了攻击");
        }
    }

    private boolean inRange() {
        //判断主角进入了怪物周围
        return true;
    }
}
