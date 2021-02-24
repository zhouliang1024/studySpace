package com.yuye.StrategyAndFactory;

/**
 * @Author yuye
 * @Date 2021/2/24 5:38 下午
 */
public class StrategyDemo {
    public static void main(String[] args) {

        Strategy strategy = StrategyFactory.getInstance().creator(3);
        Double aDouble = strategy.calRecharge(100.0, RechargeTypeEnum.BUSI_ACCOUNTS);
        System.out.println(aDouble);
    }
}
