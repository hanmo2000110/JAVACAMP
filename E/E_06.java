import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e06();
  }
  void e06(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a rows and columns > ");
    int rows = scanner.nextInt();
    int columns = scanner.nextInt();

    for (int i = 1; i <= columns; i++) {
      for (int j = 1; j <= rows; j++) {
        System.out.printf("%3d ", i * j);
        // if(j%rows == 0) System.out.println();
      }
      System.out.println();
    }

  }
}