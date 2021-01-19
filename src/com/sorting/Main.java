package com.sorting;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        Random random = new Random();
        int[] array = new int[N];
        for (int i = 0; i < N ; i++) {
            array[i] = random.nextInt(1000);
        }
        long before = System.currentTimeMillis();
        new QuickSort().sort(array);
        long after = System.currentTimeMillis();
        System.out.println("Время исполнения = " + (after - before) + " мс.");


        System.out.println(Arrays.toString(array));

    }
}
