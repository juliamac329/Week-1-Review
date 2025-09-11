/*
Julia Macdonald
September 11th, 2025
Grade 11 Review - ICS4U Palindrome
*/

import java.util.Scanner;

public class ICS4UPalindrome {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // variables
    String userInput;
    String reversedUserInput;

    // User input
    System.out.println("Enter a word or phrase:");
    userInput = sc.nextLine();
    userInput = userInput.toLowerCase(); // convert to lowercase
    reversedUserInput = new StringBuilder(userInput).reverse().toString();

    if (userInput.equals(reversedUserInput)) {
        System.out.println( userInput + " is a palindrome!"); }
        else {
            System.out.println(userInput + " is not a palindrome.");
        }
    }
}

