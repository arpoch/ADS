package com.algorithms.recursion.divideandconquer;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Tower(3,'A','B','C');
    }

    public static void Tower(int disk,char src, char dest,char aux){
        if(disk==1){
            System.out.println("Move disk "+disk+" from "+src+" to "+dest);
            return;
        }
        Tower(disk-1,src,aux,dest);
        System.out.println("Move disk "+disk+" from "+src+" to "+dest);
        Tower(disk-1,aux,dest,src);
    }
}
