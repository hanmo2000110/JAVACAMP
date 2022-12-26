import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b01();
  }
  void b01(){
    Scanner s = new Scanner(System.in);
    int birth_year; //태어난 년도
    int age; // 나이
    System.out.print("Enter a birth year > ");
    birth_year = s.nextInt();
    age = 2021 - birth_year + 1;
    if(age >= 20) System.out.println("You are adult");
    else System.out.println("You are not adult");

  }
}