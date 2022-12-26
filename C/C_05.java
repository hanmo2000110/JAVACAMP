import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c05();
  }
  void c05(){
    Scanner scan = new Scanner(System.in);
    int month, day;
    int day_count = 0;
    
    System.out.print("Enter a month > ");
    month = scan.nextInt();
    System.out.print("Enter a day > ");
    day = scan.nextInt();
    
    if (month < 1 || month > 12 || day < 1) {
      System.out.println("This date is not valid.");
      return;
    }
    
    for (int i = 1; i < month; i++) {
      switch (i) {
        case 2:
          day_count += 28;
          break;
        case 4:
        case 6:
        case 9:
        case 11:
          day_count += 30;
          break;
        default:
          day_count += 31;
          break;
      }
    }
    day_count += day;
    
    System.out.printf("This date is %dth of the year", day_count);
    
    
  }
}