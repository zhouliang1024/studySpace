package com.yuye.StrategyAndFactory;

/**
 * @Author yuye
 * @Date 2021/2/24 5:36 下午
 */
public class Context {

    private Strategy strategy;

    public Double calRecharge(Double charge, Integer type) {
        strategy = StrategyFactory.getInstance().creator(type);
        return strategy.calRecharge(charge, RechargeTypeEnum.valueOf(type));
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
