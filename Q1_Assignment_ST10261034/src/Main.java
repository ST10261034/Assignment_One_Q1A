/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Scanner Kb = new Scanner(System.in);
        System.out.println("Student Management Application");
        
        System.out.println("Enter (1) to launch the menu or any other key to quit \n");
        int ichoice = Kb.nextInt();
        
        if (ichoice == 1) {
        while (true) {
            System.out.println("Menu:");//main menu
            System.out.println("1. Capture a new student");
            System.out.println("2. Search for a student");
            System.out.println("3. Delete a student");
            System.out.println("4. View student report");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Student.captureStudent(students, scanner);//calls for method
                    break;
                case 2:
                    Student.searchStudent(students, scanner);
                    break;
                case 3:
                    Student.deleteStudent(students, scanner);
                    break;
                case 4:
                    Student.studentReport(students);
                    break;
                case 5:
                    Student.exitStudentApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
            
        }
        }
    }
}

