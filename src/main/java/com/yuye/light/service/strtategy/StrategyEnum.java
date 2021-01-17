package com.yuye.light.service.strtategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 14:09
 */
public enum StrategyEnum {

    DOG (1,"dof"),
    CAT (2,"mimi"),
    ;

    private static List<Integer> codeList= new ArrayList<>();

    static {
        Arrays.stream(StrategyEnum.values()).forEach(checkEnum -> {
            codeList.add(checkEnum.getCode());
        });
    }

    Integer code;
    String msg;


    StrategyEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
    static StrategyEnum getEnum(Integer code){
        StrategyEnum[] values = StrategyEnum.values();
        for (StrategyEnum value : values) {
            if (value.getCode().equals(code)){
                return value;
            }
        }
        return null;
    }
    private static boolean isValid(List<Integer> list){
       return codeList.containsAll(list);
    }
}
