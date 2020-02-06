package Basics.PersonalInformation;

public class PersonalInformation {
    public static void main(String[] args) {
        // Book: Starting Out With Java; Page: 106; Chapter 2 - Java Fundamentals
            //3. Personal Information
                //Write a program that displays the following information, each on a separate line:
                    //• Your name
                    //• Your address, with city, state, and ZIP
                    //• Your telephone number
                    //• Your college major
                    //Although these items should be displayed on separate output lines, use only a single println
                    //statement in your program.

        String name =       "Morteza Radmehr";
        String address =    "34 Herring Cove Road, Apt # 5, ";
        String city =       "Halifax, " ;
        String province =   "NS, ";
        String postalCode = "B3N 1P5";
        String phone =      "1-782-882-0790";
        String diploma =    "IT Database Administration";

        System.out.println(
                name + "\n" + address + city + province + postalCode + "\n" + phone + "\n" + diploma);
        System.out.println("\n\t===== ===== ===== =====");
        System.out.print("Morteza Radmehr ");
    }

}
