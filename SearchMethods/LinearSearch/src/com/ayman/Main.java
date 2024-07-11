package com.ayman;

public class Main {
    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 77, 454, -3456, 8};
        int target = 69;

        int result = linearSearch(nums, target);
        System.out.println(result);

    }


}
