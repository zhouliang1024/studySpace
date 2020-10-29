package com.yuye.october.twentyNine;

/**
 * @Author yuye
 * @Date 2020/10/28 4:51 下午
 */
public class Hero extends Subject {
    void move(){
        System.out.println("主角进行了移动");
        notifyObserver();
    }
}
