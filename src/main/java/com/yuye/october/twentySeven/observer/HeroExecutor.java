package com.yuye.october.twentySeven.observer;

/**
 * @Author yuye
 * @Date 2020/10/28 12:11 上午
 */
public class HeroExecutor {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Monster monster = new Monster();
        hero.attachObserver(monster);
        hero.move();
    }
}
