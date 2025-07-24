package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    
    @Test
    public void testGreet() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.greet("Zhang San");
        assertEquals("Hello, Zhang San!", result);
    }
}