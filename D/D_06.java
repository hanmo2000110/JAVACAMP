import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d06();
  }
  void d06(){
    int mediumCount = 0;
    int bigCount = 0;
    int smallCount = 0;
    int smallMediumCount = 0;

    // Create a Scanner object for reading input
    Scanner scan = new Scanner(System.in);

    // Keep reading input until the input is 0
    for (int i = 0 ; i < 10 ; i++) {
      System.out.print("Enter area of Apartment(m^2) > ");

      // Read the area from the input
      double area = scan.nextDouble();

      // Check if the area is 0 and break if that is the case
      if (area == 0) {
        break;
      }

      // Convert the area to pyung
      double pyung = area / 3.305;

      // Check which category the apartment belongs to and increment the corresponding count
      if (pyung < 15) {
        smallCount++;
      } else if (pyung < 30) {
        smallMediumCount++;
      } else if (pyung < 50) {
        mediumCount++;
      } else {
        bigCount++;
      }

      // Print the converted area in pyung
      System.out.printf("Area of Apartment(pyung) %.1f\n" , pyung);
    }

    // Print the counts
    System.out.println("Count of small-sized apartment is " + smallCount);
    System.out.println("Count of small and medium-sized apartment is " + smallMediumCount);
    System.out.println("Count of medium-sized apartment is " + mediumCount);
    System.out.println("Count of big-sized apartment is " + bigCount);
  
  }
}