package com.yuye.october.twentyNine;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yuye
 * @Date 2020/10/28 4:49 下午
 */
public abstract class Subject {
    private List<Observer> observers=new ArrayList<>();
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }
    public void notifyObserver(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
