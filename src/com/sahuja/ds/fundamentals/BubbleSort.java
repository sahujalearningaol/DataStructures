package com.sahuja.ds.fundamentals;

import java.util.Arrays;

/**
 * Created by Sourabh on 1/13/2017.
 * Push the larget number to the very right. The largest is positioned there. Next push the next largest to the second last position
 * and so on
 */
public class BubbleSort {
    public void sortData(int[] data){
        for(int i = data.length; i > 0; i--) {
            for(int j = 1; j < i; j++) {
                if (data[j - 1] > data[j]) {
                    int temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
            System.out.println(Arrays.toString(data));
        }
    }


    public static void main(String[] args) {
        int[] data = {5,8,4,10,3,2};
        BubbleSort sort = new BubbleSort();
        sort.sortData(data);
       // System.out.println(Arrays.toString(data));
    }
}
