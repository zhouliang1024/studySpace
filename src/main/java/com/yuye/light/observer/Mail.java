package com.yuye.light.observer;

import lombok.Data;

/**
 * @Author yuye
 * @Date 2021/4/7 3:30 下午
 */
@Data
public class Mail {
    private Integer id;
    private String addressee;
    private String sender;
    private String receiver;
    private String message;
}
