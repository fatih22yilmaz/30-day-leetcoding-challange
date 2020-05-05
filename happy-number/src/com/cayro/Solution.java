package com.cayro;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {
        Set<Integer> unHappyNumbers = new HashSet<>();

        while (true) {
            int result = 0;
            int temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                temp = temp / 10;
                result += digit * digit;
            }
            if (result == 1) {
                return true;
            }
            if (unHappyNumbers.contains(result)) {
                break;
            }
            unHappyNumbers.add(n);
            n = result;
        }

        return false;
    }

    public boolean isHappy2(int n) {

        do {
            int result = 0;
            while (n > 0) {
                int digit = n % 10;
                n = n / 10;
                result += digit * digit;
            }
            if (result == 1) {
                return true;
            }
            n = result;
        } while (n == 7 || n > 9);

        return false;
    }
}
