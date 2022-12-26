import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b04();
  }
  void b04(){
    Scanner s = new Scanner(System.in);
    double m2_area; //면적 (제곱미터)
    double pyung_area; // 면적 (평수)

    System.out.print("Enter area of Apartment(m^2) > ");
    m2_area = s.nextDouble();

    pyung_area = m2_area / 3.305;
    System.out.printf("Area of Apartment(평수) %.1f\n", pyung_area);
    if(pyung_area > 30) System.out.print("It is big apartment");
    else System.out.print("It is small apartment");
  }
}