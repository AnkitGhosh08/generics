package com.codinclub;

import java.util.Arrays;

public class MaximumNumber<E extends Comparable <E>> {
    E[] array;
    public MaximumNumber(E[] array) {
        this.array = array;
    }
    public E maximum() {
        return MaximumNumber.maximumIs(array);
    }
    public static <E extends Comparable<E>> E maximumIs(E[] array) {
        for (int k = 0; k < array.length - 1; k++) {
            for (int i = 0; i < array.length - k - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    E temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array " + Arrays.toString(array));
        System.out.println("Maximum from the above array is " + array[array.length - 1]+"\n");
        return array[array.length - 1];
    }
}