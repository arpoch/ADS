package com.algorithms.recursion.divideandconquer;


public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {15,5,24,8,1,3,16,10,20};
        MergeSort(arr,0,arr.length-1);
        for(int item:arr){
            System.out.println(item+" ");
        }
    }

    public static void Merge(int[] arr, int start, int mid, int end){
        int n1 = mid-start+1;
        int n2 = end-mid;

        int[] sub_arr_1 = new int[n1];
        int[] sub_arr_2 = new int[n2];

        for(int i=0;i<n1;i++){
            sub_arr_1[i] = arr[start+i];
        }
        for(int j=0;j<n2;j++){
            sub_arr_2[j] = arr[mid+1+j];
        }

        int i=0,j=0;
        int k = start;
        while (i<n1 && j<n2){
            if(sub_arr_1[i]<=sub_arr_2[j]){
                arr[k] = sub_arr_1[i];
                i++;
            }
            else{
                arr[k] = sub_arr_2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = sub_arr_1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = sub_arr_2[j];
            j++;
            k++;
        }
    }

    public static void MergeSort(int[] arr,int start, int end){
        if(start<end){
            int mid = (start + end)/2;
            MergeSort(arr,start,mid);
            MergeSort(arr,mid+1,end);
            Merge(arr,start,mid,end);
        }
    }
}
