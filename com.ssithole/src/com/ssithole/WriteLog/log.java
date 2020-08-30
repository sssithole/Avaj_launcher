package com.ssithole.WriteLog;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class log {
    private static File logTofile = null;
    private static FileWriter logFile = null;
    private static BufferedWriter logWrite = null;

    public void writeToFile(){
        try {
            logTofile = new File("/home/sikhumbubuzo/Desktop/Avaj_launcher/com.ssithole/src/com/ssithole/simulator.txt");
            logFile = new FileWriter(logTofile,false);
            logWrite = new BufferedWriter(logFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addLog(String s){
        try {
            logWrite.write(s);
            logWrite.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeLog(){
        if (logWrite != null) {
            try {
                logWrite.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
