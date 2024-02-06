package com.luv2code.tdd;

public class FizzBuzz {

//    public static String compute(int i) {
//        if(i%3==0 && i%5==0){
//            return "FizzBuzz";
//        }
//        if(i%3==0){
//            return "Fizz";
//        }
//        if(i%5==0){
//            return "Buzz";
//        }
//        return String.valueOf(i);
//    }

    public static String compute(int i) {
        StringBuilder result = new StringBuilder();

        if(i%3==0){
            result.append("Fizz");
        }
        if(i%5==0){
            result.append("Buzz");
        }
        return result.isEmpty() ? String.valueOf(i) : result.toString();
    }

}
