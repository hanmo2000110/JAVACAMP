import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c08();
  }
  void c08(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number > ");
    int num1 = scanner.nextInt();

    System.out.print("Enter second number > ");
    int num2 = scanner.nextInt();

    System.out.print("Enter third number > ");
    int num3 = scanner.nextInt();

    int max_num = Math.max(num1, Math.max(num2, num3));
    int min_num = Math.min(num1, Math.min(num2, num3));

    System.out.println("Max number is " + max_num + ", Min number is " + min_num);
  }
}