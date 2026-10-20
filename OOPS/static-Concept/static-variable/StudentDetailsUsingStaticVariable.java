
/*
 * Mini Project: Student Details Using Static Variable
 *
 * Static Keyword:
 * The static keyword makes a variable belong to the class
 * rather than individual objects.
 *
 * Static Variable:
 * A static variable is shared by all objects of a class, call by class name.
 * In this project, the college name is common to all students,
 * so it is declared as a static variable.
 *
 * Concepts Used:
 * 1. Static variables
 * 2. Classes and objects
 * 3. Arrays of objects
 * 4.Scanner for user input
 */


import java.util.Scanner;

class College {
    static String college = "RD Engineering College";

    int rollNo;
    String name;
  
//default Constructor
    public College() {}

    public void show() {
        System.out.println("College: " + college);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("--------------------");
    }
}

public class StudentDetailsUsingStaticVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int nums = scan.nextInt();

        College[] clgStd = new College[nums];

        for (int i = 0; i < nums; i++) {
            clgStd[i] = new College();

            System.out.print("Enter student roll number: ");
            clgStd[i].rollNo = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter student name: ");
            clgStd[i].name = scan.nextLine();
        }

        System.out.println("\n--- All Student Details ---");

        for (College student : clgStd) {
            student.show();
        }

        scan.close();
    }
}
