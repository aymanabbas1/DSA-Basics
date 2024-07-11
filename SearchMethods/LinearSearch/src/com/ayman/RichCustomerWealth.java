package com.ayman;

//https://leetcode.com/problems/richest-customer-wealth/

public class RichCustomerWealth {

    static int maximumWealth(int[][] accounts) {
        // run a for each
        // add the numbers in the individual array and store the result in result
        // compare
        int result = Integer.MIN_VALUE;

        for(int[] row:accounts){
            int iresult = 0;
            for(int val:row){
                iresult += val;
            }
            if(iresult > result){
                result = iresult;
            }
        }
        return result;
    }
}


