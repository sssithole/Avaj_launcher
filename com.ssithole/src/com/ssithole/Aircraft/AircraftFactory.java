package com.ssithole.Aircraft;

public abstract class AircraftFactory {
    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height){

        if((latitude >= 0) && (longitude >= 0) && (height >= 0))
        {
            String aircraft;

            Coordinates coordinates = new Coordinates(longitude,latitude,height);
            aircraft = type.toUpperCase();
            if(aircraft.equals("BALOON")){
                return new Baloon(name,coordinates);
            }else if(aircraft.equals("JETPLANE")){
                return new JetPlane(name,coordinates);
            }else if(aircraft.equals("HELICOPTER")){
                return new Helicopter(name,coordinates);
            }else {
                System.out.println("\n***Invalid Flyable error, only baloon,jetplane,helicopter are accepted***".toUpperCase());
                System.exit(1);
                return null;
            }
        }
        System.out.println("\n***Invalid coordinate error, only Positive numeric values are accepted***".toUpperCase());
        System.exit(1);
        return null;
    }
}
