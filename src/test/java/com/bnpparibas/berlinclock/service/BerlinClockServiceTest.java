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

}
