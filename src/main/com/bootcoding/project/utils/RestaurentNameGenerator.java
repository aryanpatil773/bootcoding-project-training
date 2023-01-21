package com.bootcoding.project.utils;
import java.util.Random;
public class RestaurentNameGenerator {
    private static final String[] names = {"Haldiram Restaurent", "Ashoka Restaurent", "namking`s Restaurent", "Golden Harvest Restaurent", "chef kitchen Restaurent", "Dwarka garden Restaurent","machan Restaurent"};
    private static Random random = new Random();

    public static String getName() {
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            System.out.println(RestaurentNameGenerator.getName());
        }
    }
}

