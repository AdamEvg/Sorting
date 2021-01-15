package com.sorting;

public interface Sorting {
    void sort(int [] array);

    default void exchangeElements(int [] array, int i, int j){
        if(array[i] != array[j]){
            array[i] = array[i]^array[j];
            array[j] = array[i]^array[j];
            array[i] = array[i]^array[j];
        }
    }
}