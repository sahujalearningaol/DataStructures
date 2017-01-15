package com.sahuja.ds.recursion;

/**
 * Created by Sourabh on 1/14/2017.
 */
public class Factorial {
    public int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int fac = new Factorial().factorial(5);
        System.out.println(fac);
    }
}
