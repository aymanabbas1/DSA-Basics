package com.ayman;
//Find ceiling of a number in a sorted array ( number >= target element)
// Assumption: sort order is ascending
// number should be in between start and end, when while condition is violated, start is ahead of end.
// this means target number was not in between start and end, it went ahead, so return arr[start].
// check KK notes to understand.
// start - target - end => end - target - start. so return start.
public class Ceiling {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceiling(arr,target));
    }


    static int ceiling(int[] arr, int target){
        // What if target > greatest number in the array?
        if(target > arr[arr.length -1]) return -1;
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
        return start;
    }
}
