import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g04();
    }

    void g04() {
      Scanner sc = new Scanner(System.in);
      int kind; // 거래종류(1:매매, 2:임대, 0:계산종료)
      int money; // 거래금액
      int charge = 0; // 중개 수수료
      int total_charge; // 수수료 총액
      total_charge = 0;
      
      while (true) {
        System.out.print("Enter the type of real estate transaction(1:Trading, 2:Lease, 0:exit) > ");
        kind = sc.nextInt();
        
        if (kind == 0) {
          break;
        }
        
        System.out.print("Enter the amount of real estate transaction. > ");
        money = sc.nextInt();
        
        if (kind == 1) {
          if (money < 50000000) {
            charge = (int) (money * 0.006);
            charge = charge > 250000 ? 250000 : charge;
          } else if (money < 200000000) {
            charge = (int) (money * 0.005);
            charge = charge > 800000 ? 800000 : charge;
          } else {
            charge = (int) (money * 0.004);
          }
        } else if (kind == 2) {
          if (money < 20000000) {
            charge = (int) (money * 0.005);
            charge = charge > 70000 ? 70000 : charge;
          } else if (money < 50000000) {
            charge = (int) (money * 0.005);
            charge = charge > 200000 ? 200000 : charge;
          } else if (money < 100000000) {
            charge = (int) (money * 0.004);
            charge = charge > 300000 ? 300000 : charge;
          } else {
            charge = (int) (money * 0.003);
          }
        }
        
        
        total_charge += charge;
        System.out.println("The charge is " + charge);
        System.out.println();
      }
      
      System.out.println("Total charge is " + total_charge);
      
	}
}