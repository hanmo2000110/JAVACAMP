import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h01();
    }

    void h01() {
      int coins;
  		int[] number = new int[3];
  		int dummy;
  		int i;
  
  		Scanner scanner = new Scanner(System.in);
  		System.out.print("Enter number of coins > ");
  		coins = scanner.nextInt();
  
  		for (i = 0; coins > 0; i++) {
  			System.out.print("Start " + (i + 1) + "th game!!! (Enter any number) > ");
  			dummy = scanner.nextInt();
  
  			for (int j = 0; j < 3; j++) {
  				number[j] = (int) (Math.random() * 9) + 1;
  			}
  			System.out.println("Result of game : " + number[0] + " " + number[1] + " " + number[2] + " ---> ");
  
  			if (number[0] == number[1] && number[1] == number[2]) {
  				System.out.println("match 3 numbers! got four more coins");
  				coins += 4;
  			} else if (number[0] == number[1] || number[1] == number[2] || number[0] == number[2]) {
  				System.out.println("match 2 numbers! got two more coins");
  				coins += 2;
  			} else {
  				System.out.println("Failed...");
  			}
  			coins--;
  			System.out.println("There are " + coins + " coins remaining.");
  		}
  		System.out.println("Game over!");
  	}
}