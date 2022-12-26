import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c10();
  }
  void c10(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number1 > ");
    int num1 = scan.nextInt();
    System.out.print("Enter number2 > ");
    int num2 = scan.nextInt();
    System.out.print("Enter a math symbol('+', '-', '*', '/') ");
    String operator = scan.next();
    
    // 연산 결과
    int result = 0;
    if (operator.equals("+")) {
      result = num1 + num2;
    } else if (operator.equals("-")) {
      result = num1 - num2;
    } else if (operator.equals("*")) {
      result = num1 * num2;
    } else if (operator.equals("/")) {
      result = num1 / num2;
    }
    
    // 결과 출력
    System.out.println("Result is " + result);
  }
}