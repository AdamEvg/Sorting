package com.sorting;

public class BinaryInsertionSort implements Sorting {
    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int insertPosition = findInsertPosition( array, value, 0, i - 1);
            for (int j = i - 1; j >= insertPosition; j--) {
                array[j + 1] = array[j];
            }
            array[insertPosition] = value;
        }
    }

    public static int findInsertPosition(int[] array, int value, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (value < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int binarySearch(int[] sortedArray, int value, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (value > sortedArray[mid]) {
                low = mid + 1;
            } else if (value < sortedArray[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int recBinarySearch(int[] sortedArray, int value, int high, int low) {
        int mid = (low + high) / 2;
        if (high < low) {
            return -1;
        }
        if (sortedArray[mid] == value) {
            return mid;
        }
        if (value > sortedArray[mid]) {
            return recBinarySearch(sortedArray, value, high, mid + 1);
        }
        if (value < sortedArray[mid]) {
            return recBinarySearch(sortedArray, value, mid - 1, low);
        }
        return -1;
    }
}
