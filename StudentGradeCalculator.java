import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();

        // Initialize an array to store the scores of 4 subjects
        double[] subjectScores = new double[4];

        // Input scores for each subject
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the score for subject " + (i + 1) + ": ");
            subjectScores[i] = scanner.nextDouble();
        }

        double averageScore = calculateAverage(subjectScores);
        char grade = calculateGrade(averageScore);

        System.out.println("Student Name: " + studentName);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static char calculateGrade(double averageScore) {
        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}
