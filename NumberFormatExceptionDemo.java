import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a non-numeric string: ");
            String nonNumericString = scanner.nextLine();
            double parsedValue = Double.parseDouble(nonNumericString);
            System.out.println("Parsed value: " + parsedValue);
        } catch (NumberFormatException z) {
            System.out.println("Error: Cannot parse a non-numeric string");
        }

        try {
            System.out.print("Enter a numeric string: ");
            String userInput = scanner.nextLine();
            int intValue = Integer.parseInt(userInput);
            System.out.println("Parsed integer value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input (not a valid integer)");
        }

        try {
            double value = 12345.6789;
            DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
            String formattedValue = decimalFormat.format(value);
            System.out.println("Formatted value: " + formattedValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: Formatting issue in decimal format");
        }

        try {
            System.out.print("Enter a localized numeric value (e.g., 12,345.678): ");
            String localizedValue = scanner.nextLine();
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
            double parsedLocalizedValue = numberFormat.parse(localizedValue).doubleValue();
            System.out.println("Parsed localized value: " + parsedLocalizedValue);
        } catch (ParseException e) {
            System.out.println("Error: Incorrectly using localized decimal separators");
        }
    }
}