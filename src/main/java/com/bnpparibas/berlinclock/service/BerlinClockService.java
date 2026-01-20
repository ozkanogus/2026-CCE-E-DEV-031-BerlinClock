package com.bnpparibas.berlinclock.service;

import org.springframework.stereotype.Service;

@Service
public class BerlinClockService {

    public String getSecondsLamp(int seconds) {
        return seconds % 2 == 0 ? "Y" : "0";
    }

    public String getFiveHoursRow(int hours){
        int onLamps = hours / 5;
        return "R".repeat(onLamps) + "0".repeat(4-onLamps);
    }

    public String getOneHourRow(int hours){
        int onLamps = hours % 5;
        return "R".repeat(onLamps) + "0".repeat(4-onLamps);
    }

    public String getFiveMinutesRow(int minutes) {
        int onLamps = minutes / 5;
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            if (i < onLamps) {
                row.append((i+1) % 3 == 0 ? "R" : "Y");
            } else {
                row.append("0");
            }
        }
        return row.toString();
    }

    public String getOneMinuteRow(int minutes) {
        int onLamps = minutes % 5;
        return "Y".repeat(onLamps) + "0".repeat(4-onLamps);
    }
}
