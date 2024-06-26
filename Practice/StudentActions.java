package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentActions {

    static List<StudentObject> studentList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static int studID = 1; // student id counter

    // Register Students
    public void registerStudents() {

        // Get data from User
        System.out.println("\n--STUDENT REGISTRATION--\nEnter Student Name:");
        String studName = scanner.nextLine(); // Get StudentName from user and store in a string
        System.out.println("Enter Date of Birth:(YYYY-MM-DD)");
        String dob = scanner.nextLine(); // Get dateofbirth from user and store in a string

        // check if student name and dob is not Empty
        if (studName != "" && dob != "") {
            // Instance of StudentDetails and pass the above vaue as Arguments
            StudentObject stud1 = new StudentObject(studID, studName, dob);
            studentList.add(stud1); // After creation Push it to List
            studID++; // Post Increament student id for the next registration

            System.out.println("\nStudent registered successfully...!\n");
        } else {
            System.out.println("\nStudent is not registered...!\n");
        }

    }

    // Find by ID
    public void findByID() {
        // Check if the list is not empty
        if (checkListEmpty())
            return;

        System.out.println("\n--SEARCH STUDENT--\nEnter Student ID:");
        int inID = scanner.nextInt(); // Get input ID from user and store

        boolean isStudFound = false; // Status of Student Found

        for (StudentObject std : studentList) {
            if (std.getId() == inID) { // Check Student ID matches Input from User
                System.out.println("Student Found...!" +
                        "\nStudent ID: " + std.getId() +
                        "\nStudent Name: " + std.getStudentName() +
                        "\nDate of Birth: " + std.getDob() +
                        "\nAge: " + std.getAge() + "\n");
                isStudFound = true; // If Student found change the status
            }
        }
        if (!isStudFound)
            System.out.println("Student not found...!\n");

    }

    // Delete by ID
    public void deleteByID() {
        // Check if the list is not empty
        if (checkListEmpty())
            return;

        // Get input from user
        System.out.println("\n--DELETE STUDENT--\nEnter Student ID:");
        int inID = scanner.nextInt(); // Get input ID from user and store
        Iterator<StudentObject> iterator = studentList.iterator();
        boolean isStudFound = false; // Status of Student Found

        while (iterator.hasNext()) {
            StudentObject std = iterator.next();
            if (std.getId() == inID) {
                iterator.remove();
                System.out.println("Student deleted Successfully...!\n");
                isStudFound = true; // If Student found change the status
                break;
            }
        }
        if (!isStudFound)
            System.out.println("Student not found...!\n");
    }

    // NOT WORKING ///////////////////////////////////////
    // for (StudentDetails std : studentList) {
    // if (std.getId() == inID) {
    // studentList.remove(std);
    // }
    // }

    // Fetch Student Details
    public void fetchAllStudDetails() {
        // Check if the list is not empty
        if (checkListEmpty())
            return;

        System.out.println("\n --ALL STUDENT RECORDS--");
        for (StudentObject std : studentList)
            System.out.println(std);

        System.out.println();
    }

    // Check if the list is not empty METHOD
    public boolean checkListEmpty() {
        if (studentList.isEmpty()) {
            System.out.println("Record is Empty...!\n");
            return true;
        }
        return false;
    }

}
