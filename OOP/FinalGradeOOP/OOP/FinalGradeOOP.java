package OOP.FinalGradeOOP;

import java.util.Scanner;

public class FinalGradeOOP {

    public static void main(String[] args) {

        // create a Grade object
        Grade grade = new Grade();

        // ask user for individual grades
        Scanner s = new Scanner(System.in);

        // loop 6 times to get all assignment grades
        int i = 0;
        while (i < 6) {
            System.out.print("Enter grade for assignment " + (i+1) + ": ");
            grade.addGrade(s.nextFloat(), 100.0f);
            i++;
        }

        // determine lowest grade (Grade)
        float lowestGrade = grade.getLowestGrade();

        // display all grades (Grade)
        grade.displayAllGrades();

        // display the lowest grade (Grade)
        grade.displayLowestGrade();

        // calculate the final grade (Grade)
        float finalGrade = grade.calculateFinalGrade();

        // display the final grade
        System.out.println("Final Grade: " + finalGrade);
    }

}