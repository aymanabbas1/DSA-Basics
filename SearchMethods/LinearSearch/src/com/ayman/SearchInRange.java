package com.ayman;

public class SearchInRange {

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 77, 454, -3456, 8};
        int target = 5;
        int start = 1;
        int end = 4;

        int result = linearSearch(nums, target, start, end);
        System.out.println(result);

    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1


}
