import java.util.Scanner;

public class PerfectNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = sc.nextInt();

    sc.close();

    if (isPerfect(number)) {
      System.out.println(number + " is a perfect number.");
    } else {
      System.out.println(number + " is not a perfect number.");
    }
  }

  public static boolean isPerfect(int num) {
    int sum = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }

    return sum == num;
  }
}
