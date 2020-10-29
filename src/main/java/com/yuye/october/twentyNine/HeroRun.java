package com.yuye.october.twentyNine;

/**
 * @Author yuye
 * @Date 2020/10/28 4:52 下午
 */
public class HeroRun {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Monster monster = new Monster();
        hero.attach(monster);
        hero.move();
    }
}
