package com.yuye.StrategyAndFactory;

/**
 * @Author yuye
 * @Date 2021/2/24 5:29 下午
 */
public enum RechargeTypeEnum {

    E_BANK(1, "网银"),

    BUSI_ACCOUNTS(2, "商户账号"),

    MOBILE(3,"手机卡充值"),

    CARD_RECHARGE(4,"充值卡")
    ;

    /**
     * 状态值
     */
    private int value;

    /**
     * 类型描述
     */
    private String description;



    private RechargeTypeEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int value() {
        return value;
    }
    public String description() {
        return description;
    }


    public static RechargeTypeEnum valueOf(int value) {
        for(RechargeTypeEnum type : RechargeTypeEnum.values()) {
            if(type.value() == value) {
                return type;
            }
        }
        return null;
    }
}
