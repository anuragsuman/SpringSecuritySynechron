package com.spring.security.jwt.example.controller;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;


@SpringBootTest
public class WelcomeControllerTest {

    @Mock
    WelcomeController welcomeController;

    @Test
    public void welcomeTest(){

        Mockito.when(welcomeController.welcome()).thenReturn("welcome");
        String expected = welcomeController.welcome();
        assertEquals("welcome",expected);
    }
}
