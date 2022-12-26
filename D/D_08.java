import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d08();
  }
  void d08(){
    Scanner scan = new Scanner(System.in);

    // Read the coefficients a, b, and c from the input
    System.out.print("Enter the coefficients a and b of quadratic function(y=ax^2+bx+c) > ");
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double c = scan.nextDouble();

    // Read the start and end values of x from the input
    System.out.print("Enter the start and end values of x coordinates > ");
    double xStart = scan.nextDouble();
    double xEnd = scan.nextDouble();

    // Calculate and print the coordinates for each value of x in the given range
    for (double x = xStart; x <= xEnd; x++) {
      double y = a * x * x + b * x + c;
      System.out.println("coordinates (" + (int)x + ", " + (int)y + ")");
    }
  }
}