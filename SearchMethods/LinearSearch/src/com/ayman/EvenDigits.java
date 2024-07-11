package com.ayman;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// STEP1: while number > 0 do
// STEP2: number = number/10; basically removing a digit from the number
// STEP3: count = count + 1;
// for negative number, always -> if (num<0) num = num *-1;
// if number is zero, doesn't matter cuz  even digits we want.
//*OPTIMIZED SOLUTION* : return (int)(Math.log10(num)) +1; -> watch Kunal's
//number system video to understand.


public class EvenDigits {

    static int findNumbers(int[] arr){
        int evenCount = 0;

        for(int num: arr){
            int count = 0;
            while(num>0){
                num = num/10;
                count = count + 1;
            }

            if(count%2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }


    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
