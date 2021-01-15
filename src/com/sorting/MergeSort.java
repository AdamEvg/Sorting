package com.sorting;

import java.util.Arrays;

public class MergeSort implements Sorting {
    private static final int sentinel = Integer.MAX_VALUE;

    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            mergeSort(array, startIndex, midIndex);
            mergeSort(array, midIndex + 1, endIndex);
            merge(array, startIndex, midIndex, endIndex);
        }
    }

    private void merge(int[] array, int start, int mid, int end) {
        int[] left = Arrays.copyOfRange(array, start, mid + 2);
        int[] right = Arrays.copyOfRange(array, mid + 1, end + 2);
        left[left.length - 1] = sentinel;
        right[right.length - 1] = sentinel;
        for (int k = start, i = 0, j = 0; k < end + 1; k++) {
            if (left[i] < right[j]) {
                array[k] = left[i++];
            } else {
                array[k] = right[j++];
            }
        }
    }
}
