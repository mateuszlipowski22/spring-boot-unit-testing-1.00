package com.luv2code.tdd;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int[] integers = IntStream.range(1, 100).toArray();
        for (int integer : integers){
            System.out.println(FizzBuzz.compute(integer));
        }
    }
}
