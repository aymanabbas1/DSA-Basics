package com.ayman;

import java.util.Arrays;

// check KK notes or the binary search in 2d arrays vid Code 1 to understand
// here, value is increasing row wise and column wise.
public class SearchInRowColEachIncreaseMatrix {

    public static void main(String[] args) {
        int arr[][] = {
                {10, 20 ,30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(arr, 37)));
    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;

        while(row< matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row, col};
            } else if (matrix[row][col] > target) {
                col--;
            }
            else row++;
        }
        return new int[]{-1,-1};

    }
}