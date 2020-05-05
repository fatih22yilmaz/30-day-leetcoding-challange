package com.cayro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

    public int singleNumber(int[] nums) {

        Map<Integer, Integer> collect = Arrays.stream(nums).boxed().collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum));

        Map.Entry<Integer, Integer> integerIntegerEntry = collect.entrySet().stream().filter(entry -> entry.getValue().equals(1)).findFirst().get();

        return integerIntegerEntry.getKey();
    }

    public int singleNumber2(int[] nums) {
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i : nums) {
            if (!numberMap.containsKey(i)) numberMap.put(i, 1);
            else numberMap.put(i, numberMap.get(i) + 1);
        }

        for (int i : numberMap.keySet()) {
            if (numberMap.get(i) == 1) {
                return i;
            }
        }

        return -1;
    }

    public int singleNumber3(int[] nums) {
        int sum = 0;

        for (int i : nums) {
            sum ^= i;
        }

        return sum;
    }
}
