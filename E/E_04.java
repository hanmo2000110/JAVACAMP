import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e04();
  }
  void e04(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a type of gugudan (1: odd, 2: even) > ");
    int mode = sc.nextInt();

    // 입력받은 출력모드에 따라 구구단을 출력한다.
    if (mode == 1) {
      // 홀수단
      for (int i = 3; i <= 9; i += 2) {
        for (int j = 1; j <= 9; j++) {
          System.out.printf("%d X %d = %d\t", i, j, i * j);
          if(j%3 == 0) System.out.println();
        }
        System.out.println();
      }
    } else if (mode == 2) {
      // 짝수단
      for (int i = 2; i <= 8; i += 2) {
        for (int j = 1; j <= 9; j++) {
          System.out.printf("%d X %d = %d\t", i, j, i * j);
          if(j%3 == 0) System.out.println();
        }
        System.out.println();
      }
    } else {
      System.out.println("Invalid input.");
    }

    sc.close();

  }
}