package com.codinclub;

public class main {
    public static void main(String[] args) {
        Integer[] integerArray = { 50, 22, 44, 89, 78, 14};
        Double[] doublesArray = { 982.1, 234.1, 432.2, 453.1, 121.2};
        String[] stringArray = { "apple", "peach","banana", "orange", "mango" };

        new MaximumNumber<Integer>(integerArray).maximum();
        new MaximumNumber<Double>(doublesArray).maximum();
        new MaximumNumber<String>(stringArray).maximum();
    }
}


