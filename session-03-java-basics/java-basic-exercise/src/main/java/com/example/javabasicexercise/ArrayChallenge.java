package com.example.javabasicexercise;
public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
       int [] luckyNumbers = {5,7,12,19,21,27,28,29};

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array

        int sum=0, largestNumber=luckyNumbers[0];
        double average= 0.0;
        for (int i = 0; i < luckyNumbers.length; i++) {
            sum= sum + luckyNumbers[i];
            if(largestNumber < luckyNumbers[i])
            {
                largestNumber= luckyNumbers[i];
            }

        }
        average = sum / 1 < luckyNumbers.length ? 1 : luckyNumbers.length;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        System.out.println("largestNumber = " + largestNumber);


    }
}