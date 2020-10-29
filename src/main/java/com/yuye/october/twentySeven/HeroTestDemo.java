package com.yuye.october.twentySeven;

/**
 * @Author yuye
 * @Date 2020/10/27 11:56 下午
 */
public class HeroTestDemo {
    public static void main(String[] args) {
        //初始化实例
        Hero hero = new Hero();
        Master master = new Master();
        Trap trap = new Trap();
        AddBlood addBlood = new AddBlood();
        //注册观察者
        hero.attachObserver(master);
        hero.attachObserver(trap);
        hero.attachObserver(addBlood);
        //移动事件
        hero.move();

    }
}
