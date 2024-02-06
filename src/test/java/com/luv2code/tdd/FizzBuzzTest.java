package com.luv2code.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @DisplayName("Divisible by three")
    @Test
    @Order(1)
    void testForDivisibleByThree(){
        String expected = "Fizz";
        assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }

    @DisplayName("Divisible by five")
    @Test
    @Order(2)
    void testForDivisibleByFive(){
        String expected = "Buzz";
        assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }

    @DisplayName("Divisible by three and five")
    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive(){
        String expected = "FizzBuzz";
        assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
    }

    @DisplayName("Not divisible by three or five")
    @Test
    @Order(3)
    void testForNotDivisibleByThreeOrFive(){
        String expected = "1";
        assertEquals(expected, FizzBuzz.compute(1), "Should return 1");
    }

}