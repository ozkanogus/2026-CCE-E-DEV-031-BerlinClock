package com.bnpparibas.berlinclock.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BerlinClockServiceTest {

    private final BerlinClockService service = new BerlinClockService();

    @Test
    void testHappyPath(){
       assertEquals("0",service.getSecondsLamp(17));
       assertEquals("0000",service.getFiveHoursRow(4));
       assertEquals("RRRR",service.getOneHourRow(4));
       assertEquals("YYRYYRYYRYY",service.getFiveMinutesRow(59));
       assertEquals("YYYY",service.getOneMinuteRow(59));
    }

    @Test
    void testEdgeCases(){
        // Midnight
        assertEquals("Y",service.getSecondsLamp(0));
        assertEquals("0000",service.getFiveHoursRow(0));
        assertEquals("0000",service.getOneHourRow(0));
        assertEquals("00000000000",service.getFiveMinutesRow(0));
        assertEquals("0000",service.getOneMinuteRow(0));

        // Last second
        assertEquals("0",service.getSecondsLamp(59));
        assertEquals("RRRR",service.getFiveHoursRow(23));
        assertEquals("RRR0",service.getOneHourRow(23));
        assertEquals("YYRYYRYYRYY",service.getFiveMinutesRow(59));
        assertEquals("YYYY",service.getOneMinuteRow(59));
    }
}
