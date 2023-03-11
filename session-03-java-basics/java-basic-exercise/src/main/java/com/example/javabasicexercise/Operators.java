package com.example.javabasicexercise;


public class Operators {
    public static void main(String[] args) {
        System.out.println("testing if it runs...");
        // Step 1: Declare variables
//<<<<<<< HEAD
        int x = 9;
//=======ArrayList >>>>>>> 67ac0beb06d8bab3421ed7a32aa8b85135f8c6d0

        // Step 2: Perform arithmetic operations
        x = 2 * x + 21;

        // Step 3: Print the results of the arithmetic operations

        System.out.println("x = " + x);

        // Step 4: Perform increment and decrement operations
        int y = x + --x;

        // Step 5: Print the results of the increment and decrement operations

        System.out.println("y = " + y);

        // Step 6: Perform comparison operations

        int z = x > y ? x : y;
        System.out.println("z = " + z);

        // Step 7: Print the results of the comparison operations


        // Step 8: Perform logical operations


        // Step 9: Print the results of the logical operations


    }
}