package com.ayman;

import java.util.Arrays;

public class SearchAndMaxIn2DArray {

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row,col};
                }
                // {row,col} is the array. new int[] is used to create object and initialize
                // with row,col as new int[]{row,col}

            }

        }

        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = arr[0][0];

        for(int[] row: arr){
            for(int val: row){
                if(max<val)
                    max = val;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {2,5,46,75,34},
                {3,664,7535,12},
                {4,6,4,8,7}
        };
        // this can also be:  int[][] arr = new int[][]{ {...}, {...}, {...} };
        int target = 664;
        int[] ans = search(arr, target); // format of return value {row,col}

        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
}
