import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e02();
  }
  void e02(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a height of right triangle and black > ");
    int height = scanner.nextInt();
    int blank = scanner.nextInt();
    for (int i = 1; i <= height; i++) {
      // 여백 출력
      for (int j = 1; j <= blank + height - i; j++) {
        System.out.print(" ");
      }
      // '*' 출력
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println(); // 줄 바꿈
    }
  }
}