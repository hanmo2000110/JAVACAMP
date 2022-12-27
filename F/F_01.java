import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f01();
    }

    void f01() {
      Scanner scan = new Scanner(System.in);
      // 10개의 숫자를 담을 리스트
      int[] num = new int[10];
      // 첫 번째로 큰 수
      int first;
      // 두 번째로 큰 수
      int second;
      // 두 번째로 큰 수의 인덱스
      int second_max_index;
      // 숫자 입력을 위한 변수
      int newnum;
      // 반복문을 위한 변수
      int i;
      
      // 10개의 숫자 입력
      for (i = 0; i < 10; i++) {
        System.out.print("Enter " + (i+1) + "th number > ");
        newnum = scan.nextInt();
        num[i] = newnum;
      }
      
      // 첫 번째로 큰 수 찾기
      first = num[0];
      second_max_index = 0;
      for (i = 1; i < 10; i++) {
        if (num[i] > first) {
          first = num[i];
          second_max_index = i;
        }
      }
      
      // 두 번째로 큰 수 찾기
      second = num[0];
      for (i = 1; i < 10; i++) {
        if (i == second_max_index) {
          continue;
        }
        if (num[i] > second) {
          second = num[i];
        }
      }
      
      // 결과 출력
      System.out.println("Second largest number is " + (second_max_index ) + "th number " + second);


	  }
}