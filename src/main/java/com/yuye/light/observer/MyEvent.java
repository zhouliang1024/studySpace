package com.yuye.light.observer;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @Author yuye
 * @Date 2021/4/7 3:31 下午
 */
@Data
public class MyEvent  {

    private  Mail mail;

    public MyEvent(Mail mail) {
        this.mail = mail;
    }
}
