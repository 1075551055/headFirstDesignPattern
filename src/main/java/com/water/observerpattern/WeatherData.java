package com.water.observerpattern;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList observers;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int exist = observers.indexOf(observer);
        if(exist > 0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        //command + j => fori
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    //用于测试
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
