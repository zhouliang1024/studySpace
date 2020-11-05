package com.yuye.elevenFive.callback;

/**
 * @Author yuye
 * @Date 2020/11/5 4:33 下午
 */
public class CallBackTest {
    public static void main(String[] args) {
        System.out.println("==========");
        Boss boss = new Boss();
        Tina tina = new Tina();
        boss.issuedTask(tina);
        System.out.println("==========");
    }
}
