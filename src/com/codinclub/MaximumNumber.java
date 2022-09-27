package com.codinclub;

import java.lang.constant.Constable;

public class MaximumNumber<E extends Comparable <E>> {
    E a, b, c;

    public static <E extends Comparable<E>> E maximumIs(E a, E b, E c) {
        {
            E max = a;
            if (b.compareTo(max) > 0)
                max = b; // b is the largest

            if (c.compareTo(max) > 0)
                max = c; // c is the largest

            return max; // returns the largest object
        }
    }
}