import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d01();
  }
  void d01(){
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a number > ");
  int number = scanner.nextInt();
  int totalsum = 0;

  if (number <= 1) {
    System.out.println("Invalid input");
  } else {
    for (int i = 1; i <= number; i++) {
      totalsum += i;
    }
    System.out.println("The sum of all integer from 1 to the number entered is " + totalsum);
  }
}
}
