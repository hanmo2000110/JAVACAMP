import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d09();
  }
  void d09(){
    Scanner scan = new Scanner(System.in);

    // Read the number for the gugudan
    int num;
    do {
      System.out.print("Enter number of gugudan(2~9) > ");
      num = scan.nextInt();
      if (num < 2 || num > 9) {
        System.out.println("Invalid input");
      }
    } while (num < 2 || num > 9);

    // Calculate and print the gugudan for the given number
    for (int i = 1; i <= 9; i++) {
      System.out.println(num + " X " + i + " = " + num * i);
    }
  }
}