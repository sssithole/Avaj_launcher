package com.ssithole.Weather;

import com.ssithole.Aircraft.Coordinates;

import java.util.Random;

public class WeatherProvider {
    private static WeatherProvider weatherProvider;
    private static String[] weather = {"SNOW", "RAIN", "SUN", "FOG"};

    private WeatherProvider() {
    }

    public static WeatherProvider getProvider() {
        WeatherProvider weatherProvider = new WeatherProvider();
        return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates){
       int i = 0;
        if ((coordinates.getLongitude() >= 0) && (coordinates.getLatitude() >= 0) && (coordinates.getHeight() >= 0)){
            Random r = new Random();
            i = r.nextInt(4);
        }
        return (weather[i]);
    }
}
