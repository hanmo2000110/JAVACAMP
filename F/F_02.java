import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f02();
    }

    void f02() {
      Scanner scanner = new Scanner(System.in);
      double[] scores = new double[10];

      for (int i = 0; i < 10; i++) {
        System.out.print("Enter " + (i + 1) + "th score > ");
        scores[i] = scanner.nextDouble();
      }
      
      double maxScore = Double.MIN_VALUE;
      double minScore = Double.MAX_VALUE;
      double total = 0;
      for (int i = 0; i < 10; i++) {
        if (scores[i] > maxScore) {
          maxScore = scores[i];
        }
        if (scores[i] < minScore) {
          minScore = scores[i];
        }
        total += scores[i];
      }
      
      total -= maxScore + minScore; // 가장 큰 점수와 가장 작은 점수를 제외한 점수의 합계
      double average = total / 8; // 8개의 점수에 대한 평균
      System.out.printf("Average is %.1f\n" ,average);

	}
}