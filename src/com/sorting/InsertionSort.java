package com.sorting;

public class InsertionSort implements Sorting {
    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            for (int j = i - 1; j >= 0 && value < array[j]; j--) {
                array[j + 1] = array[j];
                array[j] = value;
            }
        }
    }
}
