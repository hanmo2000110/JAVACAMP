import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d07();
  }
  void d07(){
    // Create a Scanner object for reading input
    Scanner scan = new Scanner(System.in);

    // Read the coefficients a and b from the input
    System.out.print("Enter the coefficients a and b of linear function(y=ax+b) > ");
    double a = scan.nextDouble();
    double b = scan.nextDouble();

    // Read the start and end values of x from the input
    System.out.print("Enter the start and end values of x coordinates > ");
    double xStart = scan.nextDouble();
    double xEnd = scan.nextDouble();

    // Calculate and print the coordinates for each value of x in the given range
    for (double x = xStart; x <= xEnd; x++) {
      double y = a * x + b;
      System.out.println("coordinates (" + (int)x + ", " + (int)y + ")");
    }
  }
}