package com.bootcoding.project.utils;

import java.util.Random;

public class CityGenerator {
    private static final String[] names = {"Nagpur", "pune", "Mumbai", "Chandrapur", "Aurangabad", "nashik","kolhapur","solapur","latur","dhule","jalgav"};
    private static Random random = new Random();
    public static String getName(){
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            System.out.println(CityGenerator.getName());

        }
        }
    }
