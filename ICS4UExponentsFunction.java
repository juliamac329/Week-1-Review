/*
Julia Macdonald
September 10th, 2025
Grade 11 Review - ICS4U Exponents Function
*/

import java.util.Scanner;

public class ICS4UExponentsFunction {

    // Exponent function
    public static double power(double base, int exponent) {
        double result = 1.0;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User input
        System.out.println("Enter a base (decimal number):");
        double base = sc.nextDouble();
        System.out.println("Enter an exponent (integer):");
        int exponent = sc.nextInt();
        // function call and output
        double result = power(base,exponent);
        System.out.println(base + " to the power of " + exponent + " is " +result);
      }
}
