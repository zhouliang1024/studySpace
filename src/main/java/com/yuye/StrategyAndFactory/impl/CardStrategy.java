package com.yuye.StrategyAndFactory.impl;

import com.yuye.StrategyAndFactory.RechargeTypeEnum;
import com.yuye.StrategyAndFactory.Strategy;

/**
 * @Author yuye
 * @Date 2021/2/24 5:36 下午
 */
public class CardStrategy implements Strategy {
    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge+charge*0.01;
    }
}
