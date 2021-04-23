package exercises.controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashmapPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        String newStudent;
        System.out.println("Enter your students (or ENTER to finish):");

        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Student ID: ");
                Integer studentId = input.nextInt();
                students.put(studentId, newStudent);

            }
        } while (!newStudent.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }


    }
}
