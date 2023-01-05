import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h04();
    }

    void h04() {
      int com_finger; // 컴퓨터가 낸 가위(1), 바위(2), 보(3)
      int my_finger; //사용자가 낸 가위(1), 바위(2), 보(3)
      int score[][] = new int[2][3];//결과 횟수 리스트 [[컴퓨터의 승, 무, 패], [사용자의 승, 무, 패]]
      int i, j; // 반복문을 위한 변수
      Scanner scanner = new Scanner(System.in);
      while (true) {
        com_finger = (int)(Math.random()*3) + 1;
        System.out.print("Enter Scissors(1) Rock(2) Paper(3) > ");
        my_finger = scanner.nextInt();
        if (my_finger == 0) break;
        if (com_finger == my_finger) {
          System.out.println("Draw!");
          score[0][1]++;
          score[1][1]++;
        }
        else if (com_finger == 1 && my_finger == 3 || com_finger == 2 && my_finger == 1 || com_finger == 3 && my_finger == 2) {
          System.out.println("You win!");
          score[0][2]++;
          score[1][0]++;
        }
        else {
          System.out.println("Computer win..");
          score[0][0]++;
          score[1][2]++;
        }
      }
      System.out.println("Computer : win - " + score[0][0] + ", lost - " + score[0][2] + ", draw - " + score[0][1]);
      System.out.println("User : win - " + score[1][0] + ", lost - " + score[1][2] + ", draw - " + score[1][1]);
    }
}