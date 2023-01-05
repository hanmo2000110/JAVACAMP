import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i03();
    }

    void i03() {
      Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter height(cm) and weight > ");
            int height = sc.nextInt();
            int weight = sc.nextInt();
            AskBiman(height, weight);
           System.out.println();
        }
	}
  public static void AskBiman(int height, int weight) {
        double bmi = weight / Math.pow((height / 100.0), 2);
        if(bmi < 18.5) {
            System.out.println("You are low weight");
        } else if(bmi < 23) {
            System.out.println("You are normal weight");
        } else if(bmi < 25) {
            System.out.println("You are high weight");
        } else if(bmi < 30) {
            System.out.println("You are obesity");
        } else {
            System.out.println("You are high obesity");
        }
    }
}