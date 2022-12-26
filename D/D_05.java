import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d05();
  }
  void d05(){
    int squareCount = 0;
    int sideToSideCount = 0;
    int topToBottomCount = 0;
    int horizontalCount = 0;
    int verticalCount = 0;

    // Create a Scanner object for reading input
    Scanner scan = new Scanner(System.in);

    // Keep reading input until width or height is less than or equal to 0
    while (true) {
      System.out.print("Enter width, height of Rectangle > ");

      // Read width and height from the input
      int width = scan.nextInt();
      int height = scan.nextInt();

      // Check if width or height is less than or equal to 0 and break if that is the case
      if (width <= 0 || height <= 0) {
        break;
      }

      // Check which category the rectangle belongs to and increment the corresponding count
      if (width == height) {
        squareCount++;
      } else if (width > height * 2) {
        sideToSideCount++;
      } else if (height > width * 2) {
        topToBottomCount++;
      } else if (width > height) {
        horizontalCount++;
      } else {
        verticalCount++;
      }
    }

    // Print the counts
    System.out.println("Count of square is " + squareCount);
    System.out.println("Count of an oblong rectangle from side to side is " + sideToSideCount);
    System.out.println("Count of an oblong rectangle from top to bottom is " + topToBottomCount);
    System.out.println("Count of a horizontal rectangle is " + horizontalCount);
    System.out.println("Count of a vertical rectangle is " + verticalCount);
  }
  
}