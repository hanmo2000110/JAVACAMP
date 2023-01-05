import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i01();
    }

    void i01() {
      
        Scanner sc = new Scanner(System.in); 
        int totalPrice = 0; 
        while (true) { 
          ShowMenu(); 
            int menuNum = sc.nextInt(); 
            if (menuNum == 5) { 
                break; 
            } 
            int price = 0; 
            switch (menuNum) { 
            case 1: 
                price = 15000; 
                break; 
            case 2: 
                price = 10000; 
                break; 
            case 3: 
                price = 7000; 
                break; 
            case 4: 
                price = 2000; 
                break; 
            } 
            totalPrice += price; 
            System.out.println("Order price from now on is " + totalPrice); 
                  System.out.println();
        } 
        System.out.println("Total price is " + totalPrice);                    System.out.println();
	}
  public static void ShowMenu() {
		System.out.print("1. pizza(15,000) 2. spaghetti(10,000) 3. salad(7,000) 4. drink(2,000) 5. exit > ");
	}
}