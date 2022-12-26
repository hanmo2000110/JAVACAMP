import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c07();
  }
  void c07(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter file size as megabytes > ");
    int megabytes = scanner.nextInt();
    long bytes = megabytes * 1024 * 1024;
    
    System.out.print("Enter transfer method (1. WiFi, 2. Bluetooth, 3. LTE, 4. USB) > ");
    byte kind = scanner.nextByte();
    
    double time;
    switch (kind) {
      case 1:
        time = (double) bytes / 1500000;
        break;
      case 2:
        time = (double) bytes / 300000;
        break;
      case 3:
        time = (double) bytes / 1000000;
        break;
      case 4:
        time = (double) bytes / 60000000;
        break;
      default:
        System.out.println("Invalid transfer method!");
        return;
    }
    
    System.out.printf("File transfer time is %.1f", time);

  }
}