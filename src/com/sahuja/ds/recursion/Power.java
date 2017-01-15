package com.sahuja.ds.recursion;

/**
 * Created by Sourabh on 1/14/2017.
 */
public class Power {
    public int pow(int number, int power) {
        if(power == 0) {
            return 1;
        }
        return number * pow(number, power - 1);
    }

    public static void main(String[] args) {
        int power = new Power().pow(3,4);
        System.out.println(power);
    }
}
