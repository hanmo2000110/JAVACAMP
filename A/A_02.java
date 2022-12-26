import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a02();
  }
    void a02(){
  	Scanner s = new Scanner(System.in);
    System.out.print("Enter Celsius temperature > ");
    double c_degree = s.nextDouble();
    double f_degree = c_degree*1.8 + 32;
  	System.out.println("Fahrenheit temperature is "+f_degree);
  }
}