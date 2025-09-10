/*
Julia Macdonald
September 10th, 2025
Grade 11 Review - ICS4U Sequence
*/

import java.util.Scanner;

public class ICS4USequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        //variables
        int userInput;

        // user input
        System.out.println("Enter a positive integer:");
        userInput = sc.nextInt();

        // check if even or odd then calculate next number in sequence
        while (userInput > 1) {
            if (userInput % 2 == 0) {
                System.out.println(userInput + " is an even number.");
                userInput = userInput / 2;
                System.out.println("Next number in the sequence is " + userInput + ".");
            } else {
                System.out.println(userInput + " is an odd number.");
                userInput = userInput * 3 + 1;
                System.out.println("Next number in the sequence is " + userInput + ".");
            }
        }
        System.out.println("The sequence has ended.");


    }
}
