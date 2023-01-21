package com.bootcoding.project.utils;

import java.util.Random;

public class QuantityGenerator {
    private static final String[] names = {""};
    private static Random random = new Random();

    public static String getName() {
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(QuantityGenerator.getName());
        }
    }
}
