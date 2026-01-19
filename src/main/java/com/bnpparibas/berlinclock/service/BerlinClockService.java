package com.bnpparibas.berlinclock.service;

public class BerlinClockService {

    public String getSecondsLamp(int seconds) {
        return seconds % 2 == 0 ? "Y" : "0";
    }

    public String getFiveHoursRow(int hours){
        int onLamps = hours / 5;
        StringBuilder row = new StringBuilder();
        for(int i=0;i<4;i++){
            row.append(i < onLamps ? "R" : "0");
        }
        return row.toString();
    }
}
