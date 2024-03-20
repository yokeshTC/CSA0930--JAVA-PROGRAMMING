import java.util.Scanner;

public class studentgrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for Subject 1:");
        int subject1 = scanner.nextInt();
        System.out.println("Enter marks for Subject 2:");
        int subject2 = scanner.nextInt();
        System.out.println("Enter marks for Subject 3:");
        int subject3 = scanner.nextInt();
        System.out.println("Enter marks for Subject 4:");
        int subject4 = scanner.nextInt();
        int totalMarks = subject1 + subject2 + subject3 + subject4;
        double aggregate = totalMarks / 4.0;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Aggregate: " + aggregate);
        if (aggregate > 75) {
            System.out.println("Grade: Distinction");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("Grade: First Division");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("Grade: Second Division");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("Grade: Third Division");
        } else {
            System.out.println("Grade: Fail");
        }

        scanner.close();
    }
}
