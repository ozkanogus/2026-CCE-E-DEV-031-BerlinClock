package com.bnpparibas.berlinclock.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BerlinClockServiceTest {

    @Test
    void shouldReturnYForEvenSeconds(){
        BerlinClockService service = new BerlinClockService();

        String result = service.getSecondsLamp(0);

        assertEquals("Y",result);
    }

    @Test
    void shouldReturn0ForOddSeconds(){
        BerlinClockService service = new BerlinClockService();

        String result = service.getSecondsLamp(1);

        assertEquals("0",result);
    }

    @Test
    void shouldReturnAllOffForZeroHourInFiveHoursRow(){
        BerlinClockService service = new BerlinClockService();

        String result = service.getFiveHoursRow(0);

        assertEquals("0000",result);
    }

    @Test
    void shouldReturnTwoRedLampsForTenHour(){
        BerlinClockService service = new BerlinClockService();

        String result = service.getFiveHoursRow(10);

        assertEquals("RR00",result);
    }

    @Test
    void shouldReturnFourRedLampsForTwentyThreeHours(){
        BerlinClockService service = new BerlinClockService();

        String result = service.getFiveHoursRow(23);

        assertEquals("RRRR",result);
    }

    @Test
    void shouldReturnThreeRedLampsForThreeHours() {
        BerlinClockService service = new BerlinClockService();

        String result = service.getOneHourRow(3);

        assertEquals("RRRO", result);
    }

    @Test
    void shouldReturnOneRedLampForSixHours() {
        BerlinClockService service = new BerlinClockService();

        String result = service.getOneHourRow(6);

        assertEquals("ROOO", result);
    }

    @Test
    void shouldReturnThreeRedLampsForTwentyThreeHours() {
        BerlinClockService service = new BerlinClockService();

        String result = service.getOneHourRow(23);

        assertEquals("RRRO", result);
    }

}
