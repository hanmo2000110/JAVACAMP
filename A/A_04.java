import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a04();
  }
  void a04(){
  	Scanner s = new Scanner(System.in);
    System.out.print("Enter area of Apartment(m^2) > ");
    double m2_area = s.nextDouble();
    double pyung_area = m2_area/3.305;
  	System.out.printf("Area of Apartment(평수) %.1f\n",pyung_area);
    s.close();
  }
}