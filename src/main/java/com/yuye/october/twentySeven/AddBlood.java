package com.yuye.october.twentySeven;

/**
 * 加血
 *
 * @Author yuye
 * @Date 2020/10/27 11:52 下午
 */
public class AddBlood implements Observer {
    @Override
    public void update() {
        if (inRange()){
            System.out.println("主角得到了加血恢复");
        }
    }

    private boolean inRange() {
        //主角在血条影响范围内
        return true;
    }
}
