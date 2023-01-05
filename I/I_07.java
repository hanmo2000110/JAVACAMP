import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Main stepI = new Main();
      stepI.i07();
  }

  void i07() {
    Scanner sc = new Scanner(System.in);
        int price = 0;
        int count = 0;

        while(true) {
            price += SelectCan(sc);
            
            count++;
            System.out.print("Do you need more menu? (Y/N) > ");
            String ans = sc.next();
            if(ans.equals("N") || ans.equals("n")) {
                System.out.println("Total price for " + count + " drinks is " + price);
                break;
            }
            System.out.println();
        }
	}
  int SelectCan(Scanner sc) {
    System.out.println("1. Cola(700) 2. coffee(300) 3. lemon tea(1000) 4. milk tea(500) 5. cocoa(600)");
    System.out.print("Please select menu > ");
    int num = sc.nextInt();
            switch (num) {
                case 1 :
                    return 700;

                case 2 :
                    return 300;

                case 3 :
                    return 1000;

                case 4 :
                    return 500;
                case 5 :
                    return 600;
            }
    return 0;
  }
}