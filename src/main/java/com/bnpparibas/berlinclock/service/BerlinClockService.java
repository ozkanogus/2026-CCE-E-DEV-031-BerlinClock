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

    public String getOneHourRow(int hours){
        int onLamps = hours % 5;
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            row.append(i < onLamps ? "R" : "O");
        }
        return row.toString();
    }

    public String getFiveMinutesRow(int minutes) {
        int onLamps = minutes / 5;

        StringBuilder row = new StringBuilder();
        for (int i = 1; i <= 11; i++) {
            if (i <= onLamps) {
                if (i % 3 == 0) {
                    row.append("R");
                } else {
                    row.append("Y");
                }
            } else {
                row.append("O");
            }
        }
        return row.toString();
    }

    public String getOneMinuteRow(int minutes) {
        int onLamps = minutes % 5;

        StringBuilder row = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            if (i < onLamps) {
                row.append("Y");
            } else {
                row.append("O");
            }
        }
        return row.toString();
    }


}
