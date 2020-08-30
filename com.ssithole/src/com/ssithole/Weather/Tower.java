package com.ssithole.Weather;

import com.ssithole.Aircraft.Flyable;

import java.util.ArrayList;

public abstract class Tower {
    private ArrayList<Flyable> fly = new ArrayList<>();

    public void register(Flyable flyable){
        fly.add(flyable);
    }

    public void unregister(Flyable flyable){
        fly.remove(flyable);
    }

    protected void conditionchange(){
        for(int i = 0;i < fly.size(); i++){
            fly.get(i).updateCondition();
        }
    }
}
