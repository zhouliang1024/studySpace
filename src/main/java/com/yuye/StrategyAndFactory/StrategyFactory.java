package com.yuye.StrategyAndFactory;

import com.yuye.StrategyAndFactory.impl.BusiAcctStrategy;
import com.yuye.StrategyAndFactory.impl.CardStrategy;
import com.yuye.StrategyAndFactory.impl.EBankStrategy;
import com.yuye.StrategyAndFactory.impl.MobileStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yuye
 * @Date 2021/2/24 5:37 下午
 */
public class StrategyFactory {
    private static StrategyFactory factory = new StrategyFactory();
    private StrategyFactory(){
    }
    private static Map<Integer ,Strategy> strategyMap = new HashMap<>();
    static{
        strategyMap.put(RechargeTypeEnum.E_BANK.value(), new EBankStrategy());
        strategyMap.put(RechargeTypeEnum.BUSI_ACCOUNTS.value(), new BusiAcctStrategy());
        strategyMap.put(RechargeTypeEnum.MOBILE.value(), new MobileStrategy());
        strategyMap.put(RechargeTypeEnum.CARD_RECHARGE.value(), new CardStrategy());
    }
    public Strategy creator(Integer type){
        return strategyMap.get(type);
    }
    public static StrategyFactory getInstance(){
        return factory;
    }
}
