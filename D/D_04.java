import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d04();
  }
  void d04(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of family members > ");
    int countAll = sc.nextInt();
    int countYoung = 0;

    for (int i = 0; i < countAll; i++) {
      System.out.print("Enter a birth year > ");
      int birthYear = sc.nextInt();
      int age = 2021 - birthYear + 1;
      if (age < 20) {
        countYoung++;
      }
    }

    System.out.println("There are " + countYoung + " youngs in the family.");
  }
}