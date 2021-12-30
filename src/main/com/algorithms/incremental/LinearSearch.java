package com.algorithms.incremental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(linearSearch(15));
    }

    public static String linearSearch(int key) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(34, 56, 24, 1, 5, 133, 56, 15));
        for (Integer integer : list) {
            if (integer == key) {
                return "true";
            }
        }
        return "false";
    }
}