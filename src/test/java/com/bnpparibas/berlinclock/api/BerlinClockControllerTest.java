package com.bnpparibas.berlinclock.api;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class BerlinClockControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnBerlinClockForValidTime() throws Exception {
        mockMvc.perform(get("/api/berlin-clock")
                        .param("time", "04:59:17"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.seconds").value("0"))
                .andExpect(jsonPath("$.fiveHours").value("0000"))
                .andExpect(jsonPath("$.oneHour").value("RRRR"))
                .andExpect(jsonPath("$.fiveMinutes").value("YYRYYRYYRYY"))
                .andExpect(jsonPath("$.oneMinute").value("YYYY"));
    }

    @Test
    void shouldReturnBadRequestForInvalidTime() throws Exception {
        mockMvc.perform(get("/api/berlin-clock")
                        .param("time", "25:61:61"))
                .andExpect(status().isBadRequest());
    }
}
