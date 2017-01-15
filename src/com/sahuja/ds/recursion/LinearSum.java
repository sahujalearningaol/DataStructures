package com.sahuja.ds.recursion;

/**
 * Created by Sourabh on 1/15/2017.
 */
public class LinearSum {
    public static int linearSum(int[] data, int index) {
        if(index == 0) {
            return data[0];
        } else {
            return data[index] + linearSum(data, index - 1);
        }
    }

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5};
        System.out.println(linearSum(data, 4));
    }
}
