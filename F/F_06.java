import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f06();
    }

    void f06(){
      int[][] apartment = new int[5][3];

    // Read the number of people in each room from the user
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            int floor = i + 1;
            int room = j + 1;
            System.out.print("Enter number of people in room " + (floor * 100 + room) + " > ");
            apartment[i][j] = input.nextInt();
        }
    }

    // Calculate the total number of people living in the apartment
    int total = 0;
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            total += apartment[i][j];
        }
    }

    // Print the total number of people living in the apartment
    System.out.println("Number of people living in this apartment is " + total);
	}
}