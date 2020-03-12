import Inheritance.Employees.*;

public class EmployeesTest {

    public static void main(String[] args) {

        Employee manager = new Employee("Big John");
        Grunt grunt   = new Grunt("Little John");

        // upcasting
        Employee gruntEmployee = grunt;
        //gruntEmployee.getWorkingHours();
        System.out.println(gruntEmployee);

        // downcasting
        // this will not work since a manager is not a grunt!
        // manager = grunt; <-- works if a manager is a grunt
        if (manager instanceof Grunt) {
            Grunt gruntManager = (Grunt) manager;
            System.out.println(gruntManager.getWorkingHours());
        }

    }

}