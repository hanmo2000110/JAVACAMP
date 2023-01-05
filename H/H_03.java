import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h03();
    }

    void h03() {
      int lotto_com[] = new int[6];
      int count = 0;
      boolean isDuplicate;
      while(count < 6) {
        isDuplicate = false;
        int random_num = (int)(Math.random() * 45 + 1);
        for (int i = 0; i < count; i++) {
          if (lotto_com[i] == random_num) {
            isDuplicate = true;
          }
        }
        if (!isDuplicate) {
          lotto_com[count] = random_num;
          count++;
        }
      }
  
      // 사용자로부터 로또 번호 입력
      int lotto_user[] = new int[6];
      count = 0;
      while(count < 6) {
        System.out.print("Enter your " + (count+1) + "th lotto number > ");
        int input_num = Integer.parseInt(System.console().readLine());
        isDuplicate = false;
        for (int i = 0; i < count; i++) {
          if (lotto_user[i] == input_num) {
            isDuplicate = true;
          }
        }
        if (input_num >= 1 && input_num <= 45 && !isDuplicate) {
          lotto_user[count] = input_num;
          count++;
        } else {
          System.out.println("Invalid input!");
        }
      }
  
      // 로또 번호 비교
      int match_count = 0;
      for (int i = 0; i < 6; i++) {
        if (lotto_com[i] == lotto_user[i]) {
          match_count++;
        }
      }
  
      // 결과 출력
      System.out.print("Lotto numbers of this week are ");
      for (int i = 0; i < 6; i++) {
        System.out.print(lotto_com[i] + " ");
      }
      System.out.println();
      System.out.println("There are " + match_count + " matching lotto numbers.");
	}
}