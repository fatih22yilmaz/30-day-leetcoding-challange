package com.cayro;

public class Solution {

    public void moveZeroes(int[] nums) {
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i - zeroCount] = nums[i];
            } else {
                zeroCount++;
            }
        }

        for (; zeroCount > 0; zeroCount--) {
            nums[nums.length - zeroCount] = 0;
        }

    }
}
