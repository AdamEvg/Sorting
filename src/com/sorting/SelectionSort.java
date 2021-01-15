package com.sorting;

public class SelectionSort implements Sorting{
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int indexOfSmallestElement = i;
            for (int j = i; j <array.length ; j++) {
                if(array[indexOfSmallestElement]>array[j]){
                    indexOfSmallestElement = j;
                }
            }
            exchangeElements(array,i,indexOfSmallestElement);
        }
    }
}
