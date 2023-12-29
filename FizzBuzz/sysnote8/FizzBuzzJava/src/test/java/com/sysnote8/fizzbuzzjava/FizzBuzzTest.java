package com.sysnote8.fizzbuzzjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void SimpleTest() {
        assertEquals("1", Main.getFizzBuzz(1));
        assertEquals("2", Main.getFizzBuzz(2));
        assertEquals("Fizz", Main.getFizzBuzz(3));
        assertEquals("Fizz", Main.getFizzBuzz(6));
        assertEquals("Buzz", Main.getFizzBuzz(5));
        assertEquals("Buzz", Main.getFizzBuzz(10));
        assertEquals("FizzBuzz", Main.getFizzBuzz(15));
        assertEquals("FizzBuzz", Main.getFizzBuzz(30));
    }
}
