package com.yuye.light.service.pipeline;


import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: zhouliang
 * @Date: 2021/1/17 16:55
 */
@Service
public abstract class Pipeline<T> {
    private List<MsgHandleValve<T>> valveList;

    public boolean invoke(T data){
        PipelineContext<T> context = new PipelineContext<T>(data);
        //MUST ThreadSafe
        Iterator<MsgHandleValve<T>> it = valveList.listIterator();
        while (it.hasNext() && !context.isBroken()){
            it.next().invoke(context);
        }
        return !context.isBroken();
    }

    public List<MsgHandleValve<T>> getValveList() {
        return valveList;
    }

    public void setValveList(List<MsgHandleValve<T>> valveList) {
        this.valveList = valveList;
    }

    /**
     * pipeline订阅的事件类型
     * @return
     */
    public abstract String attachedEvent();
}
