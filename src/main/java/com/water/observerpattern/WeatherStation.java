package com.water.observerpattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        //WeatherData注册CurrentConditionDisplay
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        //当weatherData有更新的时候，会通知到所有的观察者
        weatherData.setMeasurements(23.5f, 0.8f, 200.0f);
    }
}
