import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d03();
  }
  void d03(){
    Scanner scanner = new Scanner(System.in);

    // Initialize variables
    int number; // input number
    int count = 0; // number of input numbers
    int totalSum = 0; // total sum of input numbers
    double average; // average value of input numbers

    // Read input numbers until an invalid number is entered
    while (true) {
      System.out.print("Enter a number from 0 to 100 > ");
      number = scanner.nextInt();

      // Check if the input number is valid
      if (number < 0 || number > 100) {
        break; // exit the loop if the input number is invalid
      }

      // Update the count and total sum of input numbers
      count++;
      totalSum += number;
    }

    // Calculate and print the average value of input numbers
    average = (double) totalSum / count;
    System.out.printf("The sum of %d numbers is %d, average is %.1f\n", count, totalSum, average);
  }
}