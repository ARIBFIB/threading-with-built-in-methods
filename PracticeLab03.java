import java.util.Scanner;

public class PracticeLab03 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String nameOfStudent = inputScanner.nextLine();

        System.out.print("Enter total marks: ");
        int maxMarks = inputScanner.nextInt();

        System.out.print("Enter obtained marks: ");
        int marksObtained = inputScanner.nextInt();

        double percentScore = (marksObtained * 100.0) / maxMarks;

        String studentGrade;
        double studentGPA;
        if (percentScore >= 90) {
            studentGrade = "A";
            studentGPA = 4.0;
        } else if (percentScore >= 80) {
            studentGrade = "B";
            studentGPA = 3.0;
        } else if (percentScore >= 70) {
            studentGrade = "C";
            studentGPA = 2.0;
        } else if (percentScore >= 60) {
            studentGrade = "D";
            studentGPA = 1.0;
        } else {
            studentGrade = "F";
            studentGPA = 0.0;
        }

        System.out.println("Mark Sheet:");
        System.out.println("Student Name: " + nameOfStudent);
        System.out.println("Total Marks: " + maxMarks);
        System.out.println("Obtained Marks: " + marksObtained);
        System.out.println("Percentage: " +  percentScore);
        System.out.println("Grade: " + studentGrade);
        System.out.println("GPA: " + studentGPA);

        inputScanner.close();
    }
}
