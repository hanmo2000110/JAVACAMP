import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a05();
  }
  void a05(){
  	Scanner s = new Scanner(System.in);
    System.out.print("Enter number of days > ");
    int days = s.nextInt();
    int seconds = days*24*60*60;
    System.out.println("Total seconds is "+seconds);
    s.close();
  }
}