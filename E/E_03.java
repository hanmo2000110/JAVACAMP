import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e03();
  }
  void e03(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a height of triangle > ");
    int height = scanner.nextInt();
    for (int i = 1; i <= height; i++) {
      // 출력할 공백의 개수를 계산한다
      int blankCount = height - i;
      // 공백을 출력한다
      for (int j = 0; j < blankCount; j++) {
        System.out.print(" ");
      }
      // 삼각형을 출력한다
      for (int j = 0; j < (i - 1) * 2 + 1; j++) {
        System.out.print("*");
      }
      // 줄을 바꾼다
      System.out.println();
    }

  }
}