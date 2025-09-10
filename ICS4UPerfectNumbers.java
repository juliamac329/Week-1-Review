/*
Julia Macdonald
September 10th, 2025
Grade 11 Review - ICS4U Perfect Numbers
*/

public class ICS4UPerfectNumbers {

    public static boolean isPerfect(int n) {
        int sum = 0;
        // Loop from 1 to n-1 and add factors to sum
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        // Return true if sum == n
        return sum == n;
    }
    public static void main(String[] args) {

       // Uses the isPerfect function to determine from 1 to 500.
        int number = 1;
        while (number <= 500) {
            if (isPerfect(number)) {
                System.out.println(number + " ");
            }
            number = number + 1;
        }

    

    }
}