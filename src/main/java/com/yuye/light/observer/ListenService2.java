package com.yuye.light.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @Author yuye
 * @Date 2021/4/7 3:34 下午
 */
@Service
public class ListenService2 {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;


    @Autowired
    ApplicationContext context;

    public void enventTest() {
        System.err.println("开始执行的事务");

        Mail mail = new Mail();
        mail.setMessage("邮件内容*************");
        // 调用异步事件监听
        this.context.publishEvent(new Event2(this,mail));

        System.err.println("事务执行完成了");
    }

}
