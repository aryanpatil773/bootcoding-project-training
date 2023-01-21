package com.bootcoding.project.utils;

import java.util.Random;

public class PhoneNnumberGenerator {
    static Random random=new Random();
    static final long MAX=9599999999l;
    static final long MIN=9500000000l;

    public static long getPhone(){
        return MIN + random.nextLong(MAX-MIN);
    }

    public static void main(String[] args) {
        long otp =PhoneNnumberGenerator.getPhone();
        System.out.println(otp);
    }
}

