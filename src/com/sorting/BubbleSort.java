package com.sorting;

public class BubbleSort implements Sorting {
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    exchangeElements(array, j, j - 1);
                }
            }
        }
    }

}