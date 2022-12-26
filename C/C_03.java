import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c03();
  }
  void c03() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter width of Rectangle > ");
    int width = scanner.nextInt();
    System.out.print("Enter height of Rectangle > ");
    int height = scanner.nextInt();

    if (width == height) {
        System.out.println("It is square");
    } else if (width > height * 2) {
        System.out.println("It is an oblong rectangle from side to side.");
    } else if (height > width * 2) {
        System.out.println("It is an oblong rectangle from top to bottom.");
    } else if (width > height) {
        System.out.println("It is a horizontal rectangle.");
    } else {
        System.out.println("It is a vertical rectangle.");
    }
  }
}