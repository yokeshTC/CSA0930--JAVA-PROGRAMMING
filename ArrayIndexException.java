import java.util.Scanner;

public class ArrayIndexException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.print("Enter the index to access an array element: ");
            int index = scanner.nextInt();
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i <= size; i++) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Iterating beyond array length");
        }

        try {
            System.out.print("Enter the number of rows for a 2D array: ");
            int rows = scanner.nextInt();
            int[][] matrix = new int[rows][];
            for (int i = 0; i < rows; i++) {
                System.out.print("Enter the number of columns for row " + i + ": ");
                int cols = scanner.nextInt();
                matrix[i] = new int[cols];
                System.out.print("Enter the index to access an element in row " + i + ": ");
                int colIndex = scanner.nextInt();
                int value = matrix[i][colIndex];
                System.out.println("Value at index " + colIndex + ": " + value);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds (nested array)");
        }

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            printArray(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds (method call)");
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}