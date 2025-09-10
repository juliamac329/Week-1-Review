/*
Julia Macdonald
September 9th, 2025
Grade 11 Review - ICS4U Attendance
*/

import java.util.Scanner;

public class ICS4UAttendance{

    public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

        //variables
        int classesHeld;
        int classesAttended;
        int percentAttended;

        // user input
        System.out.println("Enter the number of classes held:");
        classesHeld = sc.nextInt();
        System.out.println("There were " +classesHeld+ " classes held.");
        System.out.println("Enter the number of classes you attended:");       
        classesAttended = sc.nextInt();
        System.out.println("You attended " +classesAttended+ " classes.");

        percentAttended = classesAttended *100 / classesHeld;
        System.out.println("You attended " +percentAttended+ "% of classes.");

        //allowed enterance
        if (percentAttended < 75){
            System.out.println("Unfortunately you did not attend enough classes to take the exam.");
        } else {
                System.out.println("You may take the exam, good luck!");
            }
        }
    }