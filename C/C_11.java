import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c11();
  }
  void c11(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a year > ");
    int year = scanner.nextInt();

    // check if the year is a leap year
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          System.out.println("This year is leap year");
        } else {
          System.out.println("This year is not leap year");
        }
      } else {
        System.out.println("This year is leap year");
      }
    } else {
      System.out.println("This year is not leap year");
    }
  }
}