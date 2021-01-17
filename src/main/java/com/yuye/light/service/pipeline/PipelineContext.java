package com.yuye.light.service.pipeline;

import lombok.Data;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 16:59
 */
@Data
public class PipelineContext<T> {
    private T data;

    private boolean broken;

    public PipelineContext(T data) {
        this.data = data;
    }

    public T getContext(){
        return data;
    }

    public synchronized void breakPipeline(){
        broken = true;
    }

    public boolean isBroken() {
        return broken;
    }
}
