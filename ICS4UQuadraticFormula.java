/*
Julia Macdonald
September 9th, 2025
Grade 11 Review - ICS4U Quadratic Formula 
*/

import java.util.Scanner;

public class ICS4UQuadraticFormula {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
        //variables
        int a;
        int b;
        int c;

        // user input
        System.out.println("Enter your a value:");
        a = sc.nextInt();
        System.out.println("Enter your b value:");
        b = sc.nextInt();
        System.out.println("Enter your c value:");
        c = sc.nextInt();
        System.out.println("You entered: a = " +a+ ", b = " +b+ ", c = " +c+"");

        // discriminant
        double discriminant = Math.pow(b,2) - 4*a*c;
        System.out.println("The discriminant is " +discriminant+"");

        // check for solutions and solve
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.println("There are two real solutions: x1 = " +root1+ " and x2 = " +root2+"");
        } else if (discriminant == 0) {
            double root = -b / (2*a);
            System.out.println("There is one real solution: x = " +root+"");
        } else {
            System.out.println("There are no real solutions."); 
        }


    

    }
}


