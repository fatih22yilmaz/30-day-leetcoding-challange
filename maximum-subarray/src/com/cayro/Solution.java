package com.cayro;

import java.util.Arrays;

public class Solution {

    public int maxSubArray(int[] nums) { //shitty solution O(n^3) wtf!

        int max = Integer.MIN_VALUE;

        for (int i = nums.length, counter = 1; 0 < i; i--, counter++) {
            for (int j = 0; j < i; j++) {
                int sum = Arrays.stream(Arrays.copyOfRange(nums, j, j + counter)).sum();
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

    public int maxSubArray2(int[] nums) { // better but still shitty O(n^2)

        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for (int left = 0; left < nums.length; left++) {
            int currentTotal = 0;
            for (int right = left; right < nums.length; right++) {
                currentTotal += nums[right];
                if (currentTotal > max) {
                    max = currentTotal;
                    start = left;
                    end = right;
                }
            }
        }

        System.out.println("Maximum sub array is between index: " + start + ", " + end);

        return max;
    }

    public int maxSubArray3(int[] nums) { // Kadane's algorithm O(n)

        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int num : nums) {
            maxEndingHere = Math.max(maxEndingHere + num, num);
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
        }

        return maxSoFar;
    }
}
