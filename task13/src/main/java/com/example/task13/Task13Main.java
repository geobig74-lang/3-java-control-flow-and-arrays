package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8, 2000, 5};
        int[] result = removeMoreThen1000(arr);
        System.out.println(Arrays.toString(result)); // [9, 7, 8, 5]
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) {
            return null;
        }

        int count = 0;
        for (int value : arr) {
            if (value <= 1000) {
                count++;
            }
        }

        int[] result = new int[count];

        int index = 0;
        for (int value : arr) {
            if (value <= 1000) {
                result[index++] = value;
            }
        }

        return result;
    }
}