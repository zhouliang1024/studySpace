package com.yuye.light.observer;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Author yuye
 * @Date 2021/4/7 3:32 下午
 */
@Component
public class MyListener {
    @Async
    @EventListener
    public void listenerEvent(MyEvent myEvent){
        System.out.println("已经监听到事件发生了");
        // 调用发邮件方法
        SendMail.sendMail(myEvent.getMail());
    }

}
