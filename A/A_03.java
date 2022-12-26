import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a03();
  }
  void a03(){
  	Scanner s = new Scanner(System.in);
    System.out.print("Enter width of Rectangle > ");
    int width = s.nextInt();
    System.out.print("Enter height of Rectangle > ");
    int height = s.nextInt();
    int area = width*height;
  	System.out.println("Area of Rectangle is "+area);
    s.close();
  }
}