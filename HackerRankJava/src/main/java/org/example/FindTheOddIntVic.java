package org.example;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddIntVic {

    public static void main(String[] args) {
        FindOdd fd = new FindOdd();
        int[] arr = {2, 2, 6, 6, 7, 7, 8, 8, 8};
        int n = fd.findIt(arr);
        System.out.println(n);
    }
}

class FindOdd {
    public int findIt(int[] a) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        for (int i : a) {
            nums.put(i, nums.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : nums.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
