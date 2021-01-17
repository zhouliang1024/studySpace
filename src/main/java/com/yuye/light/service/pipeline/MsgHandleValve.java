package com.yuye.light.service.pipeline;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 16:58
 */
public interface MsgHandleValve<T> {
    public void invoke(PipelineContext<T> pipelineContext);
}
