import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g03();
    }

    void g03() {
      Scanner s = new Scanner(System.in);
      int[][] scores = new int[5][3];
      for (int i = 0; i < 5; i++) {
          System.out.print("Enter Korean, English, Math score of " + (i + 1) + "th student > ");
          scores[i][0] = s.nextInt();
          scores[i][1] = s.nextInt();
          scores[i][2] = s.nextInt();
      }

      int[] korTotal = new int[3];
      int[] engTotal = new int[3];
      int[] mathTotal = new int[3];

      for (int i = 0; i < 5; i++) {
          korTotal[0] += scores[i][0];
          engTotal[0] += scores[i][1];
          mathTotal[0] += scores[i][2];
      }
      korTotal[1] = korTotal[0] / 5;
      engTotal[1] = engTotal[0] / 5;
      mathTotal[1] = mathTotal[0] / 5;
      System.out.println();
      System.out.println("1) Total score and average for each subjects");
      System.out.println("Total Korean score is " + korTotal[0] + ", average is " + String.format("%.1f",korTotal[1]/1.0) );
      System.out.println("Total English score is " + engTotal[0] + ", average is " + String.format("%.1f",engTotal[1]/1.0) );
      System.out.println("Total Math score is " + mathTotal[0] + ", average is " + String.format("%.1f",mathTotal[1]/1.0) );

      System.out.println();
      System.out.println("2) Total score and average for each students");
      for (int i = 0; i < 5; i++) {
          korTotal[2] = 0;
          engTotal[2] = 0;
          mathTotal[2] = 0;
          for (int j = 0; j < 3; j++) {
              korTotal[2] += scores[i][0];
              engTotal[2] += scores[i][1];
              mathTotal[2] += scores[i][2];
          }
          int average = (korTotal[2] + engTotal[2] + mathTotal[2]) / 3;
          String grade = getGrade(average);
          System.out.println((i + 1) + "th student score: Total - " + (korTotal[2] + engTotal[2] + mathTotal[2])/3 +
                  ", average - " + String.format("%.1f",average/3.0)   + ", grade - " + grade);
      }
	}
  public static String getGrade(int average) {
        if (average/3.0 >= 90) {
            return "A";
        } else if (average/3.0 >= 80) {
            return "B";
        } else if (average/3.0 >= 70) {
            return "C";
        } else if (average/3.0 >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}