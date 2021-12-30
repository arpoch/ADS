package com.algorithms.incremental;

import java.util.ArrayList;
import java.util.Arrays;

public class HornerRule {
    public static void main(String[] args) {
        ArrayList<Integer> coefficients = new ArrayList<>(
                //2x^2 - 5x + 30
                Arrays.asList(2,-5,30));
        int x = -2,y=0;
        for(int i=0;i<coefficients.size();i++){
            y = coefficients.get(i) + x*y;
        }
        System.out.println(y);
    }
}
