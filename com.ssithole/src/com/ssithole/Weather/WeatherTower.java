package com.ssithole.Weather;

import com.ssithole.Aircraft.Coordinates;

public class WeatherTower extends Tower{

    public String getWeather(Coordinates coordinates){
        WeatherProvider weatherProvider = WeatherProvider.getProvider();
        return weatherProvider.getCurrentWeather(coordinates);
    }

    public void changeWeather(){
        this.conditionchange();
    }
}
