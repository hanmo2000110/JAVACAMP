import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b09();
  }
  void b09(){
    Scanner s = new Scanner(System.in);
    int height, weight; // 신장(cm), 체중(kg)
    int bmi; // 비만도 수치

    System.out.print("Enter height(cm) ");
    height = s.nextInt();

    System.out.print("Enter weight(kg) ");
    weight = s.nextInt();

    bmi = (int)(weight / ( (height*0.01) * (height*0.01) ));
    
    if(bmi >= 25) System.out.print("You are obesity");
    else System.out.print("You are not obesity");
  }
}