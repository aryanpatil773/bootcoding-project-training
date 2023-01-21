package com.bootcoding.project.utils;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {23, 45, 20, 5, 95, 85, 32, 90};
        reversearray(arr);
        for(int i =0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void reversearray(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i-1] = temp;
        }
    }
}