package com.bnpparibas.berlinclock.api;

import com.bnpparibas.berlinclock.dto.BerlinClockResponse;
import com.bnpparibas.berlinclock.service.BerlinClockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api/berlin-clock")
public class BerlinClockController {

    private final BerlinClockService service;

    public BerlinClockController(BerlinClockService service) {
        this.service = service;
    }

    @GetMapping
    public BerlinClockResponse getBerlinClock(@RequestParam String time) {
        LocalTime localTime = LocalTime.parse(time);
        return new BerlinClockResponse(
                service.getSecondsLamp(localTime.getSecond()),
                service.getFiveHoursRow(localTime.getHour()),
                service.getOneHourRow(localTime.getHour()),
                service.getFiveMinutesRow(localTime.getMinute()),
                service.getOneMinuteRow(localTime.getMinute())
        );
    }
}

