package com.yuye.october.twentySeven;

/**
 * @Author yuye
 * @Date 2020/10/27 11:54 下午
 */
public class Hero extends Subject {
    void move(){
        System.out.println("主角向前进行了移动");
        notifyObservers();
    }
}
