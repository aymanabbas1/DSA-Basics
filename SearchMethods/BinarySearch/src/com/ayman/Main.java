package com.ayman;

public class Main {
    // return the index
    // return -1 if it doesn't exist

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

    while(start <= end){
        // find the middle element
        // int mid = (start + end)/2   // might be possible that (start + end) exceeds the range of int in java
        int mid = start + (end - start)/2;
        // basic maths: s + ( e - s)/2 => (2s + e - s)/2 => (s+e)/2

        if(target < arr[mid]) end = mid - 1;

        else if(target > arr[mid]) start = mid + 1;

        else return mid;

    }
        return -1;
    }


    public static void main(String[] args){
        int[] arr = {3 , 10 ,23, 64 , 127 ,226};

        int target  = 64;

        System.out.println(binarySearch(arr, target));

    }
}
