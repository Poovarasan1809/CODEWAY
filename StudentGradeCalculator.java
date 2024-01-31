import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the marks obtained in each subjects
        System.out.println("Enter the marks obtained in each subject (out of 100):");

        // Enter the total number of subjects
        int numberOfSubjects = 5;
        int[] subjectMarks = new int[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();
        }

        // Calculate the total marks
        int totalMarks = 0;
        for (int marks : subjectMarks) {
            totalMarks += marks;
        }

        // Calculate the Average Percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        // Assigning grades for percentage
        char grade = calculateGrade(averagePercentage);

        // Display total marks, average percentage, and the respective grade
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Calculate grades based on average percentage
    private static char calculateGrade(double averagePercentage) {
        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
