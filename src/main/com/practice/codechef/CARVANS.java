package com.practice.codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class CARVANS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(),n=0,speed= Integer.MAX_VALUE;
        while (t--!=0) {
            n = sc.nextInt();
            {
                int result=0;
                ArrayList<Integer> list = new ArrayList<>(n);
                while (n-- != 0) {
                    list.add(sc.nextInt());
                }
                for(int v:list){
                    if(v<speed){
                        result++;
                        speed = v;
                    }
                }
                System.out.println(result);
            }
        }
        sc.close();
    }
}
