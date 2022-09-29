package com.codinclub;

import java.util.Arrays;

public class MaximumNumber<E extends Comparable <E>> {
    E a, b, c;
    public MaximumNumber(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public E maximum() {
        return MaximumNumber.maximumIs(a, b, c);
    }
    public static <E extends Comparable<E>> E maximumIs(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}
