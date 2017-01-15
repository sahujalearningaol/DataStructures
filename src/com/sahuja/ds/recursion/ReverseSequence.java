package com.sahuja.ds.recursion;

import java.util.Arrays;

/**
 * Created by Sourabh on 1/15/2017.
 */
public class ReverseSequence {
    public static void reverse(int[] data, int low, int high) {
        if(low < high) {
            int temp = data[high];
            data[high] = data[low];
            data[low] = temp;
            reverse(data, low + 1, high - 1);
        }
    }

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5};
        reverse(data, 0, 4);
        System.out.println(Arrays.toString(data));
    }
}
