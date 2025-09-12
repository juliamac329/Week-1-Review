/*
Julia Macdonald
September 11th, 2025
Grade 11 Review - ICS4U Counting List
*/

import java.util.Scanner;
import java.util.Random;

public class ICS4UCountingList {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // variables
    int numbersOutputed = 0;
    int userInput;

    // array
    int[] numbers = new int[75];

    // outputs random list of 75 numbes between 15 and 50.
    while (numbersOutputed < 75) {
        Random random = new Random();
        int randomNumber = random.nextInt(50 - 15 + 1) + 15;
        numbers[numbersOutputed] = randomNumber;
        System.out.println(randomNumber);
        numbersOutputed++;
    }
    // asks for userInput
    System.out.println("Enter a target number to search for:");
    userInput = sc.nextInt();
    System.out.println("You entered " +userInput+ ".");

    // counts how many times userInput appears on the list
    int count = 0;
    for (int i =0; i < numbers.length; i++) {
        if (numbers[i] == userInput) {
            count++;
        }
    
    }

    // output
    System.out.println("The number " +userInput+ " appears " +count+ " times in the list.");

    }
}