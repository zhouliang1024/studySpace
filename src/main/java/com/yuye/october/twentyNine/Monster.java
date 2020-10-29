package com.yuye.october.twentyNine;

/**
 * @Author yuye
 * @Date 2020/10/28 4:45 下午
 */
public class Monster implements Observer {
    @Override
    public void update() {
        if (inRange()){
            System.out.println("怪物对主角");
        }
    }

    private boolean inRange() {
        return true;
    }
}
