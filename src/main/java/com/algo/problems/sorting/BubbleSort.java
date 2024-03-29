package com.algo.problems.sorting;

/**
 * @author Shiva Krishna K
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {12,65,22,3,45,67,24};
        sort(arr);
    }


    private static void sort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void swap(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
    }
}
