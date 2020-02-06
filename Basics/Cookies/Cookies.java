package Basics.Cookies;

    import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        // Book: Starting Out With Java; Page: 106; Chapter 2 - Java Fundamentals
            //8. Cookie Calories
                //A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are
                //10 servings in the bag and that a serving equals 300 calories. Write a program that lets the
                //user enter the number of cookies he or she actually ate and then reports the number of total
                //calories consumed.
        // Note: Each serving consist of 4 cookies (40/10 = 4) (each 4 cookies has 300 calories).

        int cookiesInABag = 40;
        int servingsInABag = 10;
        int servingCalories = 300;

        Scanner s = new Scanner(System.in);

        // User enters his/her name
        System.out.print("Enter your name: ");
        String name = s.nextLine();

        // User enters number of cookies eaten
        System.out.print("How many cookies did you eat? ");
        int numCookies = s.nextInt();

        // Output calories consumed
        int servingSize = cookiesInABag / servingsInABag;
        float userServings = (float)numCookies / servingSize;
        float userCalories = userServings * servingCalories;

        System.out.println(
                name + ", you ate " +
                "\t" + userCalories + "\t" + " calories."
        );
        System.out.println("\n\t===== ===== ===== =====");
        System.out.print("Morteza Radmehr");
    }
}
