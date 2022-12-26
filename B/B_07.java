import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b07();
  }
  void b07(){
    Scanner s = new Scanner(System.in);
    int megabytes; // 용량(메가바이트 단위)
    long bytes; // 용량(바이트 단위)
    String usb2; // USB 2.0 사용여부 (Y: 예, N: 아니요)
    int time; // 전송시간(초 단위)

    System.out.print("Enter file size as megabytes > ");
    megabytes = s.nextInt();
    bytes = (long)megabytes * 1024 * 1024;
    
    System.out.print("Enter 'Y' if USB type is 2.0 or 'N' > ");
    usb2 = s.next();

    if(usb2.equals("N")) time = (int)(bytes / 1500000);
    else time = (int)(bytes / 60000000);

    System.out.print("File transfer time is " + time);
  }
}