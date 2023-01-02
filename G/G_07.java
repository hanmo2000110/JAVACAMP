import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g07();
    }

    void g07() {
      Scanner input = new Scanner(System.in);
        int team_count; // 방문한 팀수
        int[] charge = {5000, 10000, 15000, 3000};// 연령별 수
        int[] count = new int[4]; // 입력받은 연령별 인원 수
        int[] v_count = new int[4]; // 연령별 방문자 합계
        int total_count = 0; // 총 방문자 수
        double sum = 0; // 팀별 계산한 요금
        int total_sum =0; // 총 요금
        int membership = 0; // 할인카드 종류(카드없음:0, 일반등급 카드 : 1, VIP 등급 카드 : 2)
        int i, j; // 반복문을 위한 변수
 
        System.out.println("Enter number of team >\n");
        team_count = input.nextInt();
 
        for (i = 1; i <= team_count; i++) {
            System.out.print("Enter a number of " + i + " th team member (child, youth, adult, old) > ");
            for (j = 0; j < 4; j++) {
                count[j] = input.nextInt();
                v_count[j] += count[j];
                total_count += count[j];
            }
 
            System.out.print("Enter a discount membership type of " + i + " th team (no membership:0 , normal:1 , VIP:2) > ");
            membership = input.nextInt();
            if (membership == 0) {
                sum = charge[0] * count[0] + charge[1] * count[1] + charge[2] * count[2] + charge[3] * count[3];
            } else if (membership == 1) {
                sum = charge[0] * count[0] * 0.9 + charge[1] * count[1] * 0.9 + charge[2] * count[2] * 0.9 + charge[3] * count[3] * 0.9;
            } else if (membership == 2) {
                sum = charge[0] * count[0] * 0.8 + charge[1] * count[1] * 0.8 + charge[2] * count[2] * 0.8 + charge[3] * count[3] * 0.8;
            }
            total_sum += sum;
            System.out.println("Admission fees of " + i + "th team is " + (int)sum);
          System.out.println();
        }
        System.out.println("Total number of visitors " + total_count);
        System.out.println("Total number of child " + v_count[0]);
        System.out.println("Total number of youth " + v_count[1]);
        System.out.println("Total number of adult " + v_count[2]);
        System.out.println("Total number of old " + v_count[3]);
        System.out.println("\nTotal free is " + total_sum);
 
	}
}