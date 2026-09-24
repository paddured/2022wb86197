package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testMessage() {
        String message = "Hello from DevOps Lab!";
        assertEquals("Hello from DevOps Lab!", message);
    }
}

