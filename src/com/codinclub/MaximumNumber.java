package com.codinclub;

public class MaximumNumber {
    public static int findMaximumNumber(int a,int b,int c) {
        int max = a;
        if (b > max)
            max = b; // b is the largest

        if (c > max)
            max = c; // c is the largest

        return max; // returns the largest object

    }
}
