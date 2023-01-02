import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f08();
    }

    void f08() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter a number from 1 to 100");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter %dth number > ", i + 1);
            int number = sc.nextInt();
            if (number < 1 || number > 100) {
                System.out.println("Invalid input!");
                i--; // decrement the counter to repeat the iteration
                continue;
            }
            // check if the number has already been entered
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == number) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                System.out.println("Invalid input!");
                i--; // decrement the counter to repeat the iteration
                continue;
            }
            numbers[i] = number;
        }

        // print the numbers
        for (int i = 0; i < 10; i++) {
            System.out.printf("%dth number is %d\n", i + 1, numbers[i]);
        }
    }
}