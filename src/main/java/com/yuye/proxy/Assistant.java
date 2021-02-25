package com.yuye.proxy;

/**
 * 代理主题
 *
 * @Author yuye
 * @Date 2021/2/25 11:32 下午
 */
public class Assistant implements Leader {
    private Leader leader;

    public Assistant (Leader leader){
        super();
        this.leader = leader;
    }

    @Override
    public void sign() {
        System.out.println("递给领导");
        leader.sign();
        System.out.println("装入袋子，送出");
    }
}
