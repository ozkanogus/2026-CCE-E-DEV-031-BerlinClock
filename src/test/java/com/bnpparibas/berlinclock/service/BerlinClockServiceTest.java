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

    @Test
    void shouldReturnAllOffForZeroMinutesInFiveMinutesRow() {
        BerlinClockService service = new BerlinClockService();

        String result = service.getFiveMinutesRow(0);

        assertEquals("OOOOOOOOOOO", result);
    }

    @Test
    void shouldReturnHalfHourPatternForThirtyMinutes() {
        BerlinClockService service = new BerlinClockService();

        String result = service.getFiveMinutesRow(30);

        assertEquals("YYRYYROOOOO", result);
    }

    @Test
    void shouldReturnFullPatternForFiftyNineMinutes() {
        BerlinClockService service = new BerlinClockService();

        String result = service.getFiveMinutesRow(59);

        assertEquals("YYRYYRYYRYY", result);
    }

    @Test
    void shouldReturnAllOffForZeroMinutesInOneMinuteRow() {
        BerlinClockService service = new BerlinClockService();

        String result = service.getOneMinuteRow(0);

        assertEquals("OOOO", result);
    }

    @Test
    void shouldReturnOneLampOnForOneMinute() {
        BerlinClockService service = new BerlinClockService();

        String result = service.getOneMinuteRow(1);

        assertEquals("YOOO", result);
    }

    @Test
    void shouldReturnAllOnForFourMinutes() {
        BerlinClockService service = new BerlinClockService();

        String result = service.getOneMinuteRow(4);

        assertEquals("YYYY", result);
    }

    @Test
    void shouldResetAfterFiveMinutes() {
        BerlinClockService service = new BerlinClockService();

        String result = service.getOneMinuteRow(5);

        assertEquals("OOOO", result);
    }

    @Test
    void shouldReturnCorrectPatternForSeventeenMinutes() {
        BerlinClockService service = new BerlinClockService();

        String result = service.getOneMinuteRow(17);

        assertEquals("YYOO", result);
    }


}
