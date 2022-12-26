import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepD = new Main();
    stepD.d02();
  }
  void d02() {
    int number;
    int max_num = Integer.MIN_VALUE;
    int min_num = Integer.MAX_VALUE;
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      System.out.print("Enter a number > ");
      number = scanner.nextInt();
    
      if (number < 0 || number > 100) {
        break;
      }
    
      if (number > max_num) {
        max_num = number;
      }
    
      if (number < min_num) {
        min_num = number;
      }
    }
    
    System.out.println("Max number is " + max_num + ", Min number is " + min_num);
  }
}