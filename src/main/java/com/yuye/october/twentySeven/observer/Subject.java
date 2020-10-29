package com.yuye.october.twentySeven.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yuye
 * @Date 2020/10/28 12:05 上午
 */
public abstract class Subject {
    private List<ObserverClz> observerClzList=new ArrayList<ObserverClz>();
    public void attachObserver(ObserverClz observerClz){
        observerClzList.add(observerClz);
    }
    public void detachObserver(ObserverClz observerClz){
        observerClzList.remove(observerClz);
    }
    public void notifyAllObserver(){
        for (ObserverClz observerClz : observerClzList) {
            observerClz.update();
        }
    }
}
