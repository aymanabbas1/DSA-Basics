package com.ayman;


// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

// do binary search 2 times, once to find first occurence, then to find last occurence.

// [2,3,4, 7,7,7,7,8,8] - find for 7. Ans is [3,6]
//now, mid = 4, a[mid] = 7 is potential answer. now split the array and search from both sides till a[mid]!= 7 or target
// then we find the actual first occurence


public class FirstAndLastPositionOfElementInArray {

        public static void main(String[] args) {

        }
        public int[] searchRange(int[] nums, int target) {

            int[] ans = {-1, -1};
            // check for first occurrence of target first
            ans[0] = search(nums, target, true);
            if (ans[0] != -1) {
                ans[1] = search(nums, target, false);
            }
            return ans;
        }

        // this function just returns the index value of target
        int search(int[] nums, int target, boolean findStartIndex) {
            int ans = -1;
            int start = 0;
            int end = nums.length - 1;
            while(start <= end) {
                // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
                int mid = start + (end - start) / 2;

                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    // potential ans found
                    ans = mid;
                    if (findStartIndex) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return ans;
        }
    }

