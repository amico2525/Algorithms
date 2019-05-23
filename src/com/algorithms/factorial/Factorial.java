package com.algorithms.factorial;

import java.math.BigInteger;

//Factorial for Big numbers via iteration
public class Factorial {

    public static String factorial(long i){
        BigInteger storedFactNumb = BigInteger.ONE;

        for (int k = 1; k <= i; k++){
            storedFactNumb = storedFactNumb.multiply(BigInteger.valueOf(k));
        }
       return storedFactNumb.toString();
    }
}
