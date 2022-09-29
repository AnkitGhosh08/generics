package com.codinclub;

public class main {
    public static void main(String[] args) {
        Integer a = 318, b = 44, c = 476;
        int maxInt = new MaximumNumber<Integer>(a, b, c).maximum();
        System.out.println("Maximum int number is : " + maxInt);

        Double a1 = 178.8, b1 = 99.0, c1 = 886.3;
        double maxDouble = new MaximumNumber<Double>(a1, b1,c1).maximum();
        System.out.println("Maximum double number is : " + maxDouble);

        String a2 = "apple", b2 = "peach", c2 = "banana";
        String maxString = new MaximumNumber<String>(a2, b2, c2).maximum();
        System.out.println("Maximum string is : " + maxString);
    }
}


