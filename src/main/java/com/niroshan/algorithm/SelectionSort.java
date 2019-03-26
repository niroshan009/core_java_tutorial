package com.niroshan.algorithm;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args){

        int arr[] = {1,5,2,7,2,8,2,6};
        System.out.println("Unsorted array: "+Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));

    }


    public static void selectionSort(int[] arr){

        for(int i=0; i < arr.length; i++){
            int min = i;
            for(int j = i+1; j< arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
