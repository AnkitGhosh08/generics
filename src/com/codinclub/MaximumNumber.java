package com.codinclub;

public class MaximumNumber {
    public static float findMaximumNumber(float a, float b, float c) {
        float max = a;
        if (b > max)
            max = b; // b is the largest

        if (c > max)
            max = c; // c is the largest

        return max; // returns the largest object

    }
}
