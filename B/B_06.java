import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b06();
  }
  void b06(){
    Scanner s = new Scanner(System.in);
    int kor, eng, math; //국어점수, 영어점수, 수학점수
    int total; // 총점
    double average; // 평균점수

    System.out.print("Enter points of Korean > ");
    kor = s.nextInt();
    System.out.print("Enter points of English > ");
    eng = s.nextInt();
    System.out.print("Enter points of Math > ");
    math = s.nextInt();

    total = kor + eng + math;
    System.out.println("Total point is " + total);

    average = total/3.0;
    System.out.printf("The average is %.1f\n", average);

    if(kor > 90) System.out.println("Korean grade is outstanding!");
    if(eng > 90) System.out.println("English grade is outstanding!");
    if(math > 90) System.out.println("Math grade is outstanding!");
  }
}