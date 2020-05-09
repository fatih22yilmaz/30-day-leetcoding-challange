package com.cayro;

public class MoveZeroes {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] numbers = {0, 1, 0, 3, 12, 0, 9, 0, 0, 0};
        solution.moveZeroes(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
