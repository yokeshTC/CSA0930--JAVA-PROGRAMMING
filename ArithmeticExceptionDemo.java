import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
        try {
            System.out.print("Enter a positive number for logarithm: ");
            double x = scanner.nextDouble();
            if (x <= 0) {
                throw new ArithmeticException("Logarithm of negative or zero");
            }
            double logResult = Math.log(x);
            System.out.println("Logarithm of " + x + ": " + logResult);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            System.out.print("Enter an angle in degrees (e.g., 90): ");
            double angle = scanner.nextDouble();
            if (angle == 90) {
                throw new ArithmeticException("Tan 90 degrees");
            }
            double tanResult = Math.tan(Math.toRadians(angle));
            System.out.println("Tan(" + angle + " degrees): " + tanResult);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            System.out.print("Enter a number for zero power zero: ");
            double zeroPowerZero = scanner.nextDouble();
            if (zeroPowerZero == 0) {
                throw new ArithmeticException("Zero power zero");
            }
            double result = Math.pow(zeroPowerZero, zeroPowerZero);
            System.out.println("Zero power zero: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}