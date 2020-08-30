package com.ssithole.Aircraft;

import com.ssithole.Weather.WeatherTower;

public interface Flyable {
    public void updateCondition();
    public void registerTower(WeatherTower weatherTower);
}
