import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Fibonacci numbers from 1 to 20 are as follows.");
    for(int i = 1; i <= 20; i++) {
      if(i == 1) System.out.println(i + "st : " + fibonacci(i));
      else if(i == 2) System.out.println(i + "nd : " + fibonacci(i));
      else if(i == 3) System.out.println(i + "rd : " + fibonacci(i));
      else System.out.println(i + "th : " + fibonacci(i));
    }
  }
  
  public static int fibonacci(int n) {
    if(n == 1 || n == 2) {
      return 1;
    } else {
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }
}