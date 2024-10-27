package com.tcs.rest;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.tcs.service.MsgService;

@SpringBootTest
@AutoConfigureMockMvc
public class MsgRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MsgService msgService;

    @BeforeEach
    public void setup() {
        // Any setup code if required
    }

    @Test
    public void testGetWelcome() throws Exception {
        // Mock the behavior of MsgService
        when(msgService.getWelcomeMsg()).thenReturn("Welcome to the application!");

        // Perform the GET request and check for the expected response
        mockMvc.perform(get("/map"))
                .andExpect(status().isOk())
                .andExpect(content().string("Welcome to the application!"));
    }

    @Test
    public void testGreetMsg() throws Exception {
        // Mock the behavior of MsgService
        when(msgService.getGreetMsg()).thenReturn("Hello, have a great day!");

        // Perform the GET request and check for the expected response
        mockMvc.perform(get("/Hai"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, have a great day!"));
    }
}
