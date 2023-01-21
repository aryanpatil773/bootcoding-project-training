package com.bootcoding.project.utils;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        int num=10;
        all_even_no(num);
    }
    public static void all_even_no(int num){
        System.out.println("all even numbers:");
        int i=2;
        while (i<=num) {
            System.out.println(i +"");
            i = i + 2;
        }
        System.out.println("all odd numbers:");
        int i1=1;
        while (i1<=num) {
            System.out.println(i1 +"");
            i1 = i1 + 2;
        }
    }
}