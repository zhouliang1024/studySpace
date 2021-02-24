package com.yuye.StrategyAndFactory;

/**
 * @Author yuye
 * @Date 2021/2/24 5:32 下午
 */
public interface Strategy {
    /**
     * 策略行为方法
     *
     * @param charge
     * @param type
     * @return
     */
    Double calRecharge(Double charge ,RechargeTypeEnum type);
}
