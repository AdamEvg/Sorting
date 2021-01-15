package com.sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] array = {5,4,6,3,1,9,6,10,3,0,1,2,6};
	    new InsertionSort().sort(array);
        System.out.println(Arrays.toString(array));
    }
}
