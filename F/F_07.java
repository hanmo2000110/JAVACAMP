import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f07();
    }

    void f07() {
      int[][] rooms = new int[5][3];

    // Declare variables to store the total number of people living in each floor and line
    int[] floorTotals = new int[5];
    int[] lineTotals = new int[3];
    int total = 0;

    // Read the number of people living in each room
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print("Enter number of people in room " + (i+1)  + "0" + (j+1) + " > ");
            rooms[i][j] = scan.nextInt();
        }
    }

    // Calculate the total number of people living in each floor and line
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            floorTotals[i] += rooms[i][j];
            lineTotals[j] += rooms[i][j];
            total += rooms[i][j];
        }
    }

    // Print the results
    System.out.println("Number of people living in 1 floor is " + floorTotals[0]);
    System.out.println("Number of people living in 2 floor is " + floorTotals[1]);
    System.out.println("Number of people living in 3 floor is " + floorTotals[2]);
    System.out.println("Number of people living in 4 floor is " + floorTotals[3]);
    System.out.println("Number of people living in 5 floor is " + floorTotals[4]);
    System.out.println();
    System.out.println("Number of people living in 1 line is " + lineTotals[0]);
    System.out.println("Number of people living in 2 line is " + lineTotals[1]);
    System.out.println("Number of people living in 3 line is " + lineTotals[2]);
    System.out.println();
    System.out.println("Number of people living in this apartment is " + total);
	}
}