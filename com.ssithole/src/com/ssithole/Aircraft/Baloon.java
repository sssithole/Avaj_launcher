package com.ssithole.Aircraft;

import com.ssithole.Weather.WeatherTower;
import com.ssithole.WriteLog.log;

public class Baloon extends Aircraft implements Flyable {

    public Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    private WeatherTower weatherTower;

    @Override
    public void updateCondition() {
        if(weatherTower.getWeather(coordinates).equals("SNOW")){
            this.coordinates = new Coordinates(coordinates.getLongitude(),coordinates.getLatitude(),coordinates.getHeight());
            log.addLog("Baloon#" + this.name  + "(" + this.id + "):" + " OMG The SNOW its BALL TIME");
        }else if(weatherTower.getWeather(coordinates).equals("SUN")){
            this.coordinates = new Coordinates(coordinates.getLongitude(),coordinates.getLatitude(),coordinates.getHeight());
            log.addLog("Baloon#" + this.name  + "(" + this.id + "):" + " OMG  is very hot");
        }else if(weatherTower.getWeather(coordinates).equals("FOG")){
            this.coordinates = new Coordinates(coordinates.getLongitude(),coordinates.getLatitude(),coordinates.getHeight());
            log.addLog("Baloon#" + this.name  + "(" + this.id + "):" + " OMG  cant see anything");
        }else if(weatherTower.getWeather(coordinates).equals("RAIN")){
            this.coordinates = new Coordinates(coordinates.getLongitude(),coordinates.getLatitude(),coordinates.getHeight());
            log.addLog("Baloon#" + this.name  + "(" + this.id + "):" + " OMG  it raining");
        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower){
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        log.addLog("Message from Tower : Baloon#" + this.name  + "(" + this.id + ") "
                + " has been registered to Weather Tower");
    }
}
