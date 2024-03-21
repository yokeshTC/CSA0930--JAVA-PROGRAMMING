import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a non-negative integer: ");
            int nonNegativeValue = scanner.nextInt();
            if (nonNegativeValue < 0) {
                throw new IllegalArgumentException("Value must be non-negative");
            }
            System.out.println("Entered non-negative value: " + nonNegativeValue);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.print("Enter a day of the week (MONDAY, TUESDAY, ...): ");
            String dayOfWeek = scanner.next().toUpperCase();
            DayOfWeekEnum dayEnum = DayOfWeekEnum.valueOf(dayOfWeek);
            System.out.println("Valid day of the week: " + dayEnum);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid day of the week");
        }

        try {
            System.out.print("Enter an integer between 1 and 10: ");
            int userInput = scanner.nextInt();
            if (userInput < 1 || userInput > 10) {
                throw new IllegalArgumentException("Value must be between 1 and 10");
            }
            System.out.println("Entered valid value: " + userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.print("Enter a non-empty string: ");
            String nonEmptyString = scanner.next();
            if (nonEmptyString.isEmpty()) {
                throw new IllegalArgumentException("String must not be empty");
            }
            System.out.println("Entered non-empty string: " + nonEmptyString);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    enum DayOfWeekEnum {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}