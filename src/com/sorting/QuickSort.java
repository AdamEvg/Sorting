package com.sorting;

import java.util.Random;

public class QuickSort implements Sorting {
    @Override
    public void sort(int[] array) {
        quickSort(array,0,array.length-1);
    }

    private void quickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int indexOfPivot = randomPartition(array, startIndex, endIndex);
            quickSort(array, startIndex, indexOfPivot - 1);
            quickSort(array, indexOfPivot + 1, endIndex);
        }
    }

    private int randomPartition(int[] array, int startIndex, int endIndex) {
        Random random = new Random();
        int index = random.nextInt(endIndex - startIndex + 1) + startIndex;
        exchangeElements(array, index, endIndex);
        return partition(array, startIndex, endIndex);
    }

    private int partition(int[] array, int startIndex, int endIndex) {
        int i = startIndex - 1;
        for (int j = startIndex; j < endIndex; j++) {
            if (array[j] <= array[endIndex]){
                exchangeElements(array,++i,j);
            }
        }
        exchangeElements(array,i+1,endIndex);
        return i+1;
    }
}
