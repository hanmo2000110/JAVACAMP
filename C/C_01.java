import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c01();
  }
  void c01(){
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a birth year > ");
  int birth_year = scanner.nextInt();
  int age = 2021 - birth_year + 1;

  if (age < 7) {
    System.out.println("You are baby");
  } else if (age >= 7 && age < 13) {
    System.out.println("You are child");
  } else if (age >= 13 && age < 20) {
    System.out.println("You are teenage");
  } else if (age >= 20 && age < 30) {
    System.out.println("You are youth");
  } else if (age >= 30 && age < 60) {
    System.out.println("You are middle-age");
  } else {
    System.out.println("You are old age");
  }
}

}