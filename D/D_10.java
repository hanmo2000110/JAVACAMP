import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d10();
  }
  void d10(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter two numbers > ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    // Calculate and print the multiples of either num1 or num2, but not both
    for (int i = 1; i <= 100; i++) {
      if (i % num1 == 0 && i % num2 != 0) {
        System.out.print(i + " ");
      } else if (i % num1 != 0 && i % num2 == 0) {
        System.out.print(i + " ");
      }
    }
  }
}