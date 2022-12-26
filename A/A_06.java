import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a06();
  }
  void a06(){
  	Scanner s = new Scanner(System.in);
    System.out.print("Enter points of Korean > ");
    int kor = s.nextInt();
    System.out.print("Enter points of English > ");
    int eng =s.nextInt();
    System.out.print("Enter points of Math > ");
    int math =s.nextInt();
    int total = eng + math + kor;
    double average = total / 3.0;
    System.out.println("Total point is "+total);
    System.out.printf("The average  is %.1f\n",average);
  }
}
