package com.algorithms.logarithmic;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(23,45,125,546,789,1122));
        System.out.println(binarySearch(list, 2));
    }

    public static String binarySearch(ArrayList<Integer> list,int val){
        int beg = 0, end = list.size()-1,mid=0;
        while (beg<=end){
            mid= (beg + end)/2;
            if(list.get(mid)==val){
                return "true";
            }
            else if(list.get(mid)>val){
                end = mid -1;
            }
            else if(list.get(mid)<val){
                beg = mid+1;
            }
        }
        return "false";
    }
}
