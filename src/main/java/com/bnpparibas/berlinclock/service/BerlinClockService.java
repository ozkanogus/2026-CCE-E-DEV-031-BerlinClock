package com.bnpparibas.berlinclock.service;

public class BerlinClockService {

    public String getSecondsLamp(int seconds) {
        return seconds % 2 == 0 ? "Y" : "0";
    }
}
