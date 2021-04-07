package com.yuye.light.observer;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @Author yuye
 * @Date 2021/4/7 5:47 下午
 */
@Data
public class Event2 extends ApplicationEvent {
    private  Mail mail;

    public Event2(Object source,Mail mail){
        super(source);
        this.mail=mail;
        System.out.println("正在发生了一个事件");
    }
}
