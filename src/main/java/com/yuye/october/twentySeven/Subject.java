package com.yuye.october.twentySeven;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 *
 * @Author yuye
 * @Date 2020/10/27 11:38 下午
 */
public abstract class Subject {
    private List<Observer> observerList=new ArrayList<Observer>();

    public void attachObserver(Observer observer){
        observerList.add(observer);
    }

    public void detachObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
