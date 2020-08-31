package com.ssithole;

import com.ssithole.Aircraft.AircraftFactory;
import com.ssithole.Aircraft.Flyable;
import com.ssithole.Weather.WeatherTower;
import com.ssithole.WriteLog.log;

import static com.ssithole.WriteLog.log.addLog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args){
         WeatherTower weatherTower;
         List<Flyable> flyables = new ArrayList<Flyable>();

            log log = new log();
            try {
                File file = new File("/home/sikhumbubuzo/Desktop/Avaj_launcher/com.ssithole/src/com/ssithole/senario.txt");
//                File file = new File(args[0]);
                log.writeToFile();
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = reader.readLine();
                if (line != null) {
                    weatherTower = new WeatherTower();
                    int simulate = Integer.parseInt(line.split(" ")[0]);
                    System.out.println(simulate + " Simulations to do");
                    if (simulate < 0) {
                        System.out.println("Invalid simulations count " + simulate);
                        System.exit(1);
                    }
//                    String split = line.split(" ");
                    while ((line = reader.readLine()) != null) {
                        Flyable flyable = AircraftFactory.newAircraft(line.split(" ")[0], line.split(" ")[1],
                                Integer.parseInt(line.split(" ")[2]), Integer.parseInt(line.split(" ")[3]),
                                Integer.parseInt(line.split(" ")[4]));

                        if (flyable != null) {
                            flyables.add(flyable);
                        }
                    }
                    for (Flyable flyable : flyables) {
                        flyable.registerTower(weatherTower);
                    }
                    for (int i = 0; i <= simulate; i++) {
                        weatherTower.changeWeather();
                    }
                }
//                log.addLog("\n *************** Simulation has ended ************");
                reader.close();
            } catch (FileNotFoundException e) {
                System.out.println("File " + args[0] + " Does not exist");
            } catch (IOException e) {
                System.out.println("There was an error while reading the file " + args[0]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid simulation file");
            } catch (NullPointerException e) {
                System.out.println("null");
            } catch (NumberFormatException e) {
                System.out.println("not a valid number entered in file");
            } finally {
                log.closeLog();
            }
        }
}





