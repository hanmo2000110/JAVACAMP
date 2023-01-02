import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g05();
    }

    void g05() {
      int hour, minute, charge, total_charge = 0;
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      System.out.print("Enter hours and minutes of use > ");
      hour = scanner.nextInt();
      minute = scanner.nextInt();
      
      if (hour == 0 && minute == 0) {
        break;
      }

      charge = (hour * 60 + minute) / 30 * 1000;
      if((hour * 60 + minute)%30 != 0) charge += 1000;
      if (hour >= 2 && hour < 3) {
        charge = charge - (int) (charge * 0.05);
      } else if (hour >= 3 && hour < 5) {
        charge = charge - (int) (charge * 0.1);
      } else if (hour >= 5) {
        charge = charge - (int) (charge * 0.2);
      }
      
      total_charge += charge;
      System.out.println("Your charge is " + charge);
      System.out.println();
    }

    System.out.println("Your total charge is " + total_charge);
	}
}
