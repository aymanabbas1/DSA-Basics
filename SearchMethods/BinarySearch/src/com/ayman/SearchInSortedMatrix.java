package com.ayman;

public class SearchInSortedMatrix {
    public static void main(String[] args) {

    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){

        while(cStart<=cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(target == matrix[row][mid]){
                return new int[]{row,mid};
            }
        }
    }


    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix maybe empty

        if(rows == 1){

        }
    }
}
