package main.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private int temperature;
    private String remarks;
    private List<Observer> observers;

    Weather(int temperature,String remarks){
        this.temperature = temperature;
        this.remarks = remarks;
        this.observers = new ArrayList<>();
    }

    void addObserver(Observer observer){
        observers.add(observer);
    }

    void reportChange(int temperature, String remarks){
        this.temperature = temperature;
        this.remarks = remarks;
        notifyObservers();
    }

    void notifyObservers(){
        for(Observer observer:observers){
            observer.update(this.temperature,this.remarks);
        }
    }



}
