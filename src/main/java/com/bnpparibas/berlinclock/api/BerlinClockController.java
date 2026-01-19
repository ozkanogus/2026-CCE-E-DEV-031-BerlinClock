package com.bnpparibas.berlinclock.api;

import com.bnpparibas.berlinclock.service.BerlinClockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Map;

@RestController
@RequestMapping("/api/berlin-clock")
public class BerlinClockController {

    private final BerlinClockService service;

    public BerlinClockController(BerlinClockService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<?> getBerlinClock(@RequestParam String time) {
        try {
            LocalTime localTime = LocalTime.parse(time);
            Map<String, String> result = Map.of(
                    "seconds", service.getSecondsLamp(localTime.getSecond()),
                    "fiveHours", service.getFiveHoursRow(localTime.getHour()),
                    "oneHour", service.getOneHourRow(localTime.getHour()),
                    "fiveMinutes", service.getFiveMinutesRow(localTime.getMinute()),
                    "oneMinute", service.getOneMinuteRow(localTime.getMinute())
            );
            return ResponseEntity.ok(result);
        } catch (DateTimeParseException e) {
            return ResponseEntity.badRequest().body("Invalid time format. Expected HH:mm:ss");
        }
    }
}

