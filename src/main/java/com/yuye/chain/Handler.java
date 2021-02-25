package com.yuye.chain;

/**
 * 审批抽象类
 *
 * @Author yuye
 * @Date 2021/2/26 12:47 上午
 */
public abstract class Handler {

    protected Handler handler;

    /**
     * 审批
     *
     * @param day
     * @return
     */
    public abstract boolean approve(double day);

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
