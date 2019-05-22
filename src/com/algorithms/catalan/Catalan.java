package com.algorithms.catalan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Catalan {

    public static void main(String[] args) {

        try (BufferedReader readNumber = new BufferedReader(new InputStreamReader(System.in))) {

            int number = Integer.parseInt(readNumber.readLine());
            System.out.println(Catalan.catalanCalc(number));

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static long fact(long i){

      BigInteger factNumb;

        if (i == 1) return 1;

        factNumb = BigInteger.valueOf(fact(i-1)*i);

        return factNumb.longValue();
    }

    private static String catalanCalc(int number){

        if (number < 0) {
            System.out.println("Нельзя вводить отрицательное число");
            return "";
        }
        if (number == 0){
            return "1";
        }

        BigInteger CatalanNumbRes = BigInteger.valueOf((Catalan.fact(2 * number))
                / (Catalan.fact(number + 1) * Catalan.fact(number)));

        return CatalanNumbRes.toString();
    }
}

