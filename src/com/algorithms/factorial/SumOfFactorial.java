package com.algorithms.factorial;

/*Sum of factorial numbers
Factorial is calculated in the separate Factorial class
*/

public class SumOfFactorial {

    public static int factSum(int fact){
        int total = 0;
       String factorialResult = Factorial.factorial(fact);

        for (int k = 0; k < factorialResult.length(); k++){
           total += Integer.parseInt(factorialResult.substring(k, k+1));
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(SumOfFactorial.factSum(100));
    }
}
