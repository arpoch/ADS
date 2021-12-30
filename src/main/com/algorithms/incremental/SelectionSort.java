package com.algorithms.incremental;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(23,5,42,12,34,4,12,44,1));
        selectionSort(list);
        for (Integer integer : list){
            System.out.println(integer);
        }
    }

    public static void selectionSort(ArrayList<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            int j = i + 1, key = list.get(i);
            while (j<list.size()){
                if(list.get(j)<key) {
                    key = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, key);
                }
                  j++;
            }
        }
    }
}
