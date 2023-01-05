import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h01();
    }

    void h01() {
      Scanner input = new Scanner(System.in);
      int answer; //컴퓨터가 만들어 낸 1부터 100사이의 임의의 숫자
      int number_try; // 사용자가 제시한 숫자
      int count; // 사용자가 맞추려고 시도한 횟수
      //컴퓨터가 임의의 수를 만든다.
      Random random = new Random();
      answer = random.nextInt(100) + 1;
      
      // 사용자에게 수를 맞추라고 말한다.
      System.out.println("Guess the number from 1 to 100 >");
      
      // 게임을 시작한다.
      count = 0;
      while (true) {
          // 사용자로부터 수를 입력받는다.
          number_try = input.nextInt();
          count++;
      
          // 사용자가 맞췄는지 확인한다.
          if (number_try == answer) {
              System.out.println("You figured out the number in " + count + " times");
              break;
          } else if (number_try < answer) {
              // 답보다 작은 경우
              System.out.println("Up!");
          } else {
              // 답보다 큰 경우
              System.out.println("Down!");
          }
      }
	}
}