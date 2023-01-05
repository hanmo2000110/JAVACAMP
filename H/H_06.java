import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h06();
    }

    void h06() {
      int[] number = new int[5];
        int[][] pow_value = new int[5][5];
        int max = 0;
        int min = 0;
        int max_a = 0;
        int max_b = 0;
        int min_a = 0;
        int min_b = 0;
        int i = 0;
        int j = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 5 numbers from 2 to 9 > ");

        for (i = 0; i < 5; i++) {
            number[i] = scan.nextInt();
            if (number[i] < 2 || number[i] > 9) {
                System.out.println("Please enter numbers from 2 to 9.");
                System.exit(0);
            }
        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                pow_value[i][j] = (int) Math.pow(number[i], number[j]);
                if(number[i] == number[j]) 
                  continue;
                if (i == 0 && j == 1) {
                    min = pow_value[i][j];
                    min_a = number[i];
                    min_b = number[j];
                } 
                
                if (pow_value[i][j] > max) {
                    max = pow_value[i][j];
                    max_a = number[i];
                    max_b = number[j];
                }
                if (pow_value[i][j] < min) {
                    min = pow_value[i][j];
                    min_a = number[i];
                    min_b = number[j];
                }
            }
        }

        System.out.println("Max number is " + max + " which is " + max_b + " squared of " + max_a);
        System.out.println("Min number is " + min + " which is " + min_b + " squared of " + min_a);
	}
}