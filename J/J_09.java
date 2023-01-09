import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter two numbers > ");

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int result = power(num1, num2);
    System.out.println(num2 + " square of " + num1 + " is " + result);

    sc.close();
  }

  public static int power(int num1, int num2) {
    if (num2 == 0)
      return 1;
    else if (num2 == 1)
      return num1;
    else if (num2 % 2 == 0)
      return power(num1, num2 / 2) * power(num1, num2 / 2);
    else
      return power(num1, num2 / 2) * power(num1, num2 / 2) * num1;
  }
}