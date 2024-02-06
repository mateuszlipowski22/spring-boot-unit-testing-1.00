package com.luv2code.tdd;

public class FizzBuzz {

    public static String compute(int i) {

        if(i%3==0 && i%5==0){
            return "FizzBuzz";
        }

        if(i%3==0){
            return "Fizz";
        }

        if(i%5==0){
            return "Buzz";
        }

        return String.valueOf(i);
    }

}
