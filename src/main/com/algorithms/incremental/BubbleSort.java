package com.algorithms.incremental;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>
                (Arrays.asList(34, 56, 24, 1, 5, 133, 56, 15));
        bubbleSort(list);
        for (Integer integer : list){
            System.out.println(integer);
        }
    }

    public static void bubbleSort(ArrayList<Integer> list){
        for(int i=0;i<list.size()-2;i++){
            for (int j=list.size()-1;j>i;j--){
                if(list.get(j)<list.get(j-1)){
                    list.set(j,list.get(j)+list.get(j-1));
                    list.set(j-1,list.get(j)-list.get(j-1));
                    list.set(j,list.get(j)-list.get(j-1));
                }
            }
        }
    }
}
