package com.codinclub;

import java.lang.constant.Constable;

public class MaximumNumber {
    public static String findMaximumNumber(String a, String b, String c ) {
        String max = a;
        if (b.compareTo(max) > 0)
            max = b; // b is the largest

        if (c.compareTo(max) > 0)
            max = c; // c is the largest

        return max; // returns the largest object
    }
}
