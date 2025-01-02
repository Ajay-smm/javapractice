package com.smm;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrade {

    private static Map <String,Integer> sg = new HashMap<>();

    public static void main(String [] args) {


            Scanner sc = new Scanner(System.in);
            int choice;

            do {

                System.out.println("\n Student grades options");
                System.out.println("1 add student ");
                System.out.println("2 update grade");
                System.out.println("3 display all students");
                System.out.println("4 exit");
                System.out.println("enter your choice");
                choice = sc.nextInt();
                sc.nextLine();


                switch (choice) {
                    case 1:
                        addStudent(sc);
                        break;
                    case 2:
                        updateGrade(sc);
                        break;
                    case 3:
                        displayAllStudents();
                        break;
                    case 4:
                        System.out.println("exiting the program.");
                        break;
                    default:
                        System.out.println("invalid choice. Please try again.");
                }
            } while (choice != 4);

              sc.close();


            }


    public static void addStudent(Scanner sc) {
        System.out.print("enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter grade for " + name + ": ");
        int grade = sc.nextInt();
        sc.nextLine();


        if (sg.containsKey(name)) {
            System.out.println("Student " + name + " already exists. Grade will not be added.");
        } else {
            sg.put(name, grade);
            System.out.println("Student " + name + " added with grade " + grade);
        }
    }


    public static void updateGrade(Scanner sc) {
        System.out.print("enter student name to update grade: ");
        String name = sc.nextLine();


        if (sg.containsKey(name)) {
            System.out.print("Enter new grade for " + name + ": ");
            int newGrade = sc.nextInt();
            sc.nextLine();
            sg.put(name, newGrade);
            System.out.println("Grade for " + name + " updated to " + newGrade);
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }



    public static void displayAllStudents() {
        if (sg.isEmpty()) {
            System.out.println("No students to display.");
        }
        else {
            System.out.println("\nall Students and their Grades:");

            for (Map.Entry<String, Integer> s : sg.entrySet()) {
                System.out.println("Student: " + s.getKey() + ", Grade: " + s.getValue());
            }
        }

    }


}
