package com.example.javacollectionsexercise;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */
import java.util.ArrayList;
import java.util.List;

import static java.lang.Long.sum;
public class ListExercise {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        x.add(0);
        x.add(1);
        x.add(3);
        x.add(2, 2);
        x.add(5);
        System.out.println(x);
        // loop
        int s=0;
        for (int i:x
             ) {
            s= s + i;

        }
        System.out.println("s = " + s);
        int sum = x.stream()
                .filter(a -> a % 2 != 0)
                .mapToInt(a -> a)
                .sum();
        System.out.println("sum = " + sum);
    }
}