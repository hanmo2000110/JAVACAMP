import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
      Main stepH = new Main();
      stepH.h02();
  }

  void h02() {
    int lotto[] = new int[6];
    int count;
    String onemore;

    while (true) {
        count = 0;
        while (count < 6) {
            int randomNumber = generateRandomNumber(1, 45);
            
            // 중복된 로또 번호가 없는 것만 배열에 담는다.
            if (!isDuplicated(lotto, randomNumber)) {
                lotto[count] = randomNumber;
                count++;
            }
        }

        // 생성된 로또 번호 출력
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();

        // 반복 여부 확인
        System.out.print("Do you want to generate more lotto numbers? (Y/N) > ");
        onemore = System.console().readLine();
        if (onemore.equalsIgnoreCase("N")) {
            break;
        }
    }
	}
  private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    // 중복된 로또 번호가 있는지 확인
    private static boolean isDuplicated(int[] lotto, int number) {
        for (int i = 0; i < lotto.length; i++) {
            if (lotto[i] == number) {
                return true;
            }
        }
        return false;
    }
}