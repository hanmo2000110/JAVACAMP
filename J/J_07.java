import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;

    System.out.print("Enter a number. (0 for exit) > ");
    n = scanner.nextInt();
    while (n != 0) {
      System.out.println(n + " square of 2 is " + powerOfTwo(n));
      System.out.print("Enter a number. (0 for exit) > ");
      n = scanner.nextInt();
    }
  }

  public static int powerOfTwo(int n) {
    if (n == 0) {
      return 1;
    } else {
      return 2 * powerOfTwo(n - 1);
    }
  }
}