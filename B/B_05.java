import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b05();
  }
  void b05(){
    Scanner s = new Scanner(System.in);
    int days; // 날 수
    int seconds; // 초 단위 시간
    int m_count; // 100만 초 포함 횟수

    System.out.print("Enter number of days > ");
    days = s.nextInt();
    
    seconds = days * 24 * 60 * 60;
    System.out.println("Total seconds is " + seconds);
    
    m_count = seconds/1000000;
    System.out.printf("It includes million seconds %d times",m_count);
  }
}