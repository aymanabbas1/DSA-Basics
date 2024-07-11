package com.ayman;

public class MinimumNumber {
    // assume arr.length!=0
    // return minimum from array
    static int minNum(int[] arr){
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i])
                min = arr[i];

        }

        return min;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 77, 454, -3456, 8};

        System.out.println(minNum(nums));
    }


}
