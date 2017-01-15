package com.sahuja.ds.fundamentals;

import java.util.Arrays;

/**
 * Created by Sourabh on 1/13/2017.
 */
public class InsertionSort {
    public void sortData1(int[] data){
        for(int i = 1; i < data.length; i++) {
            for(int j = i; j > 0; j--) {
                if(data[j] < data[j-1]) {
                    int temp = data[j - 1];
                    data[j-1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    public void sortData(int[] data){
        for(int i = 1; i < data.length; i++) {
            int cursor = data[i];
            int j = i;
            for(j = i; j > 0 && cursor < data[j-1]; j--){
                data[j] = data[j-1];
            }
            data[j] = cursor;
        }
    }


    public static void main(String[] args) {
        int[] data = {5,8,4,10,3,2};
        InsertionSort sort = new InsertionSort();
        sort.sortData(data);
        System.out.println(Arrays.toString(data));
    }
}
