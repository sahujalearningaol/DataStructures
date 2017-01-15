package com.sahuja.ds.recursion;

import java.util.Arrays;

/**
 * Created by Sourabh on 1/15/2017.
 */
public class Fibonacci {

    public static int fibonacciRecusion(int number) {
        if (number <= 1) {
            return number;
        }
        return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2);
    }

    // Method-2: Java program for Fibonacci number using Loop.
    public static void fibonacciLoop(int number) {
        int fibSeries[] = new int[number];
        fibSeries[0] = 0;
        fibSeries[1] = 1;

        for (int i = 2; i < number; i++) {
            fibSeries[i] = fibSeries[i-1] + fibSeries[i-2];
        }
        System.out.println(Arrays.toString(fibSeries));
    }

    private static void log(String number) {
        System.out.println(number);

    }

    public static void main(String[] args) {
        for(int i=0; i < 10; i++) {
            System.out.println(fibonacciRecusion(i));
        }

        System.out.println("-----------Loop---------------");
        fibonacciLoop(10);
    }
}
