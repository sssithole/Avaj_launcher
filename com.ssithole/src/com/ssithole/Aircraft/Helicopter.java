package com.ssithole.Aircraft;

import com.ssithole.Weather.WeatherTower;
import com.ssithole.WriteLog.log;

public class Helicopter extends Aircraft implements Flyable {

    public Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    private WeatherTower weatherTower;

    @Override
    public void updateCondition() {
        if(weatherTower.getWeather(coordinates).equals("SNOW")){
            this.coordinates = new Coordinates(coordinates.getLongitude(),coordinates.getLatitude(),coordinates.getHeight());
            log.addLog("Helicopter#" + this.name  + "(" + this.id + "):" + " OMG  its snowing");
        }else if(weatherTower.getWeather(coordinates).equals("SUN")){
            this.coordinates = new Coordinates(coordinates.getLongitude(),coordinates.getLatitude(),coordinates.getHeight());
            log.addLog("Helicopter#" + this.name  + "(" + this.id + "):" + " OMG  is very hot");
        }else if(weatherTower.getWeather(coordinates).equals("FOG")){
            this.coordinates = new Coordinates(coordinates.getLongitude(),coordinates.getLatitude(),coordinates.getHeight());
            log.addLog("Helicopter#" + this.name  + "(" + this.id + "):" + " OMG  i cant see anything foggy");
        }else if(weatherTower.getWeather(coordinates).equals("RAIN")){
            this.coordinates = new Coordinates(coordinates.getLongitude(),coordinates.getLatitude(),coordinates.getHeight());
            log.addLog("Helicopter#" + this.name  + "(" + this.id + "):" + " OMG  its raining");
        }

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        log.addLog("Message from Tower : Helicopter#" + this.name  + "(" + this.id + ") "
                + " has been registered to Weather Tower");
    }

}
