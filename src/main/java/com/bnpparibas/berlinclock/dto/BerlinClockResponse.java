package com.bnpparibas.berlinclock.dto;

public record BerlinClockResponse(
        String seconds,
        String fiveHours,
        String oneHour,
        String fiveMinutes,
        String oneMinute
) {}
