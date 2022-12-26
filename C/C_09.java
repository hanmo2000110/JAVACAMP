import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c09();
  }
  void c09(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your income > ");
    int income = sc.nextInt();
    int tax = 0;

    if (income < 10000000) {
      tax = (int)(income * 0.095);
    } else if (income < 40000000) {
      tax = (int)(income * 0.19);
    } else if (income < 80000000) {
      tax = (int)(income * 0.28);
    } else {
      tax = (int)(income * 0.37);
    }

    System.out.println("Income tax on salary is " + tax);
  }
}