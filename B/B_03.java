import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b03();
  }
  void b03(){
    Scanner s = new Scanner(System.in);
    int width, height; // 가로크기, 세로크기
    int area; // 사각형의 넓이

    System.out.print("Enter width of Rectangle > ");
    width = s.nextInt();

    System.out.println("Enter height of Rectangle > ");
    height = s.nextInt();

    System.out.println("Area of Rectangle is " + width * height + " and");
    if(width == height) System.out.print("it is square");
    else System.out.print("it is not square");
    
  }
}