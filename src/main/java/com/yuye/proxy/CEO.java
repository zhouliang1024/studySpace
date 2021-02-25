package com.yuye.proxy;

/**
 * @Author yuye
 * @Date 2021/2/25 11:30 下午
 */
public class CEO implements Leader {
    @Override
    public void sign() {
        System.out.println("CEO签文件");
    }
}
