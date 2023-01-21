package com.bootcoding.project.utils;

import java.util.Random;

public class AddressGenerator {
    private static final String[] names = {"Panchavati Nagar", "Kamal square", "Jariptaka", "Automative square", "Nara ", "Bardi","jashirani square"};
    private static Random random = new Random();
    public static String getName(){
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            System.out.println(AddressGenerator.getName());

        }
    }
}
