package com.cayro;

public class MaximumSubarray {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum sub array sum: " + solution.maxSubArray3(array));

    }
}
