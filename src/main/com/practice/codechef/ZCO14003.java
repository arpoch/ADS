package com.practice.codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ZCO14003 {
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();
        int count = 0;
        long revenue = 0L;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        while (sc.hasNextLong()){
            list.add(sc.nextLong());
        }
        sc.close();
        Collections.sort(list); //It takes O(nlgn)
        revenue = list.get(0) * list.size();
        for(int i=1;i<list.size();i++){     //It takes O(n)
            {
                revenue = Math.max(revenue, list.get(i) * (count-i));
            }
        }
        System.out.println(revenue);
    }
}

