package com.yuye.october.twentySeven.observer;

/**
 * @Author yuye
 * @Date 2020/10/28 12:09 上午
 */
public class Hero extends Subject {
    void move(){
        System.out.println("主角进行了移动");
        notifyAllObserver();
    }
}
