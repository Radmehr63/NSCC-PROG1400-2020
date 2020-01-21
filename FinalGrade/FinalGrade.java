package FinalGrade;
    // Book: Starting Out With Java; Page: 107; Chapter 2 - Java Fundamentals
        //10. Test Average
            //Write a program that asks the user to enter three test scores. The program should display
            //each test score, as well as the average of the scores.

    import java.util.Scanner;

public class FinalGrade {
    public static void main(String[] args) {

        // grade variables
        float assignment1;
        float assignment2;
        float assignment3;
        float assignment4;
        float assignment5;
        float assignment6;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter grade for assignment 1: ");
        assignment1 = s.nextFloat();
        System.out.print("Enter grade for assignment 2: ");
        assignment2 = s.nextFloat();
        System.out.print("Enter grade for assignment 3: ");
        assignment3 = s.nextFloat();
        System.out.print("Enter grade for assignment 4: ");
        assignment4 = s.nextFloat();
        System.out.print("Enter grade for assignment 5: ");
        assignment5 = s.nextFloat();
        System.out.print("Enter grade for assignment 6: ");
        assignment6 = s.nextFloat();

        // test if user chooses the optional assignment
        float finalGrade;

        if (assignment6 >= 0) {
            //if yes, determine lowest previous assignment and replace it
            float lowest = 100.0f;

            if (assignment1 < lowest) {
                lowest = assignment1;
            }
            if (assignment2 < lowest) {
                lowest = assignment2;
            }
            if (assignment3 < lowest) {
                lowest = assignment3;
            }
            if (assignment4 < lowest) {
                lowest = assignment4;
            }
            if (assignment5 < lowest) {
                lowest = assignment5;
            }

            finalGrade = assignment6;

            if (assignment1 != lowest) {
                finalGrade += assignment1;
            }
            if (assignment2 != lowest) {
                finalGrade += assignment2;
            }
            if (assignment3 != lowest) {
                finalGrade += assignment3;
            }
            if (assignment4 != lowest) {
                finalGrade += assignment4;
            }
            if (assignment5 != lowest) {
                // finalGrade = finalGrade /5.0f
                finalGrade += assignment5;
            }
                    // finalGrade = finalGrade / 5.0f;
                    finalGrade /= 5.0f;
        }

        else {
            finalGrade = (
                    assignment1 + assignment2 + assignment3 +
                            assignment4 + assignment5 /* + assignment6*/) / 5;
        }

        System.out.println("Your final grade is: " + finalGrade);

        System.out.println("\n\t===== ===== ===== =====");
        System.out.print("Morteza Radmehr");
    }
}
