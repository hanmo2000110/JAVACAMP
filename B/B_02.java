import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b02();
  }
  void b02(){
    Scanner s = new Scanner(System.in);
    double input_degree; // 입력받은 온도
    String kind; // 온도의 종류, 섭씨온도이면 'C', 화씨온도이면 'F'
    double output_degree; // 변환한 온도
    
    System.out.print("Enter temperature > ");
    input_degree = s.nextDouble();

    System.out.print("Enter type of temperature('C' for Celsius, 'F' for Fahrenheit) ");
    kind = s.next();
    
    if(kind.equals("C")) System.out.println("Fahrenheit temperature is " + (input_degree * 1.8  + 32));
    else System.out.println("Celsius temperature is " + (input_degree - 32)/1.8);
  }
}