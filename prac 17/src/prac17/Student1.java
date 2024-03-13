package prac17;
import java.util.Scanner;

class Studentt{
    private int studentID;
    private String studentName;
    private double[] marks = new double[3]; 


    public void setData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        studentID = scanner.nextInt();

        scanner.nextLine(); 
        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();

        System.out.println("Enter marks for 3 subjects:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
    }

  
    public void displayData() {
        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks for 3 subjects:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        double averageMarks = calculateAverage();
        System.out.println("Average Marks: " + averageMarks);
    }


    private double calculateAverage() {
        double totalMarks = 0;

        for (double mark : marks) {
            totalMarks += mark;
        }

        return totalMarks / marks.length;
    }
}

public class Student1{
    public static void main(String[] args) {
        Studentt student = new Studentt();
        student.setData();
        student.displayData();
    }
}
