package com.water.observerpattern;

public class CurrentConditionsDisplay implements Observer,Displayment{
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData){
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions:%f F degress and humidity %f", temperature, humidity));
    }
}
