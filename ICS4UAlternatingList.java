/*
Julia Macdonald
September 12th, 2025
Grade 11 Review - ICS4U Alternating List
*/

import java.util.Random;

public class ICS4UAlternatingList  {

    public static void main(String[] args) {

        Random random = new Random();

        // Generate random even size between 4 and 20
        int arraySize = random.nextInt(9) * 2 + 4; // (0-8)*2+4 = 4,6,...,20

        // array
        int[] randomArray = new int[arraySize];

        // Fill array with random numbers between 0 and 100
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(101); // 0 to 100
        }

        // Output in alternating reverse order
        System.out.println("Alternating reverse order:");
        int left = 0;
        int right = arraySize - 1;
        while (left < right) {
            System.out.print(randomArray[right] + " ");
            System.out.print(randomArray[left] + " ");
            right--;
            left++;
        }
        System.out.println();
    }
}