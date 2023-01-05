import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i04();
    }

      void i04() {
        int[] arr = {15000,10000,7000,2000};
          Scanner scanner = new Scanner(System.in); 
          int totalPrice = 0; 
          while (true) { 
              
              int select = SelectMenu(scanner); 
            
              if (select == -1) { 
                  System.out.println("Total price is " + (totalPrice)); 
                  break; 
              } 
              totalPrice += arr[select-1];
              System.out.println("Order price from now on is " + totalPrice); 
            System.out.println();
          } 
      
    }
  public static int SelectMenu(Scanner scanner) { 
        System.out.print("1. pizza(15,000) 2. spaghetti(10,000) 3. salad(7,000) 4. drink(2,000) 5. exit > "); 
        int select = scanner.nextInt(); 
        if(select == 5) return -1;
        return select; 
    } 
}