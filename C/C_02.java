import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c02();
  }
  void c02(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter water temperature > ");
    double input_degree = scanner.nextDouble();

    if (input_degree < 0) {
        System.out.println("Invalid input!");
    } else if (input_degree < 25) {
        System.out.println("It's cold water");
    } else if (input_degree < 40) {
        System.out.println("It's warm water");
    } else if (input_degree < 80) {
        System.out.println("It's hot water");
    } else {
        System.out.println("It's boiling water");
    }
    }

}