package com.luv2code.tdd;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Arrays.stream(IntStream.range(1, 100).toArray())
                .forEach(integer -> System.out.println(FizzBuzz.compute(integer)));

    }
}
