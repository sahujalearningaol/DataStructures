package com.sahuja.ds.recursion;

/**
 * Created by Sourabh on 1/14/2017.
 */
public class BinarySearch {
    public static boolean binarySearch(int[] data, int target, int start, int end) {
        if(start > end) {
            return false;
        }
        int mid = (start + end)/2;
        if(data[mid] == target) {
            return true;
        } if(target < data[mid]) {
            return binarySearch(data, target, start, mid - 1);
        } else {
            return binarySearch(data, target, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] data = {2,4,6,8,10,12,14,16};
        System.out.println(binarySearch(data, 1, 0, data.length -1));
    }
}
