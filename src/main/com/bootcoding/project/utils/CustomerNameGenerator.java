package com.bootcoding.project.utils;
import java.util.Random;
public class CustomerNameGenerator {
    private static final String[] names = {"Ramesh", "Suresh", "Ganesh", "Dinesh", "Mangesh", "Jayesh"};
    private static Random random = new Random();
    public static String getName(){
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
        }
        public static void main(String[] args) {
            for (int i = 0; i < 1; i++){
                System.out.println(CustomerNameGenerator.getName());

            }

        }

    }

