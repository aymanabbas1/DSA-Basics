package com.ayman;

public class OrderAgnosticBS {

    static int orderAgnosticBS(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target == arr[mid]) return mid;

            if(isAsc) {
                if (target < arr[mid]) end = mid - 1;

                else  start = mid + 1;
            }
            else{
                if (target > arr[mid]) end = mid - 1;

                else  start = mid + 1;

            }


        }
        return -1;


    }

    public static void main(String[] args) {
        int[] arr = {224, 200, 150, 130, 120 , 90};

        int target  = 120;

        System.out.println(orderAgnosticBS(arr, target));
    }
}
