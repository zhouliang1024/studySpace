package com.yuye.light.observer;

/**
 * @Author yuye
 * @Date 2021/4/7 3:30 下午
 */
public class SendMail {
    public static void sendMail(Mail mail) {
        System.out.println("开始发送邮件了:" + mail.getMessage());
    }
}
