import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f03();
    }

    void f03() {
      Scanner scanner = new Scanner(System.in);
      int[][] scores = new int[5][3]; // 학생별 국어, 영어, 수학 점수
      int[] totalScores = new int[5]; // 학생별 총점
      int[] subjectTotals = new int[3]; // 과목별 총점
      double[] subjectAverages = new double[3]; // 과목별 평균
      
      // 학생별 국어, 영어, 수학 점수 입력
      for (int i = 0; i < 5; i++) {
        System.out.print("Enter Korean, English, Math score of " + (i + 1) + "th student > ");
        scores[i][0] = scanner.nextInt();
        scores[i][1] = scanner.nextInt();
        scores[i][2] = scanner.nextInt();
      }
      
      // 학생별 총점 계산
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
          totalScores[i] += scores[i][j];
        }
      }
      
      // 과목별 총점 계산
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
          subjectTotals[j] += scores[i][j];
        }
      }
      
      // 과목별 평균 계산
      for (int i = 0; i < 3; i++) {
        subjectAverages[i] = (double) subjectTotals[i] / 5;
      }
      
      // 결과 출력
      System.out.printf("Total Korean score is %d, average is %.1f\n" ,subjectTotals[0] ,subjectAverages[0]);
      System.out.printf("Total English score is %d, average is %.1f\n" ,subjectTotals[1] ,subjectAverages[1]);
      System.out.printf("Total Math score is %d, average is %.1f\n" ,subjectTotals[2] ,subjectAverages[2]);
	}
}