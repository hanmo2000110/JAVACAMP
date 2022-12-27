import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f04();
    }

    void f04() {
      int[][] scores = new int[5][3]; // 2D array to store scores of 5 students for 3 subjects
int[] total = new int[5]; // array to store total scores of each student
float[] average = new float[5]; // array to store average scores of each student

Scanner input = new Scanner(System.in);

for (int i = 0; i < 5; i++) {
    System.out.print("Enter Korean, English, Math score of " + (i+1) + "th student > ");
    scores[i][0] = input.nextInt();
    scores[i][1] = input.nextInt();
    scores[i][2] = input.nextInt();

    total[i] = scores[i][0] + scores[i][1] + scores[i][2];
    average[i] = (float) total[i] / 3;
}

// Print scores for each student
for (int i = 0; i < 5; i++) {
    System.out.println("Total score of " + (i+1) + "th student is " + total[i] + ", average is " + String.format("%.1f",average[i]));
}
	}
}