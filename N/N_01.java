import java.util.Scanner;
import java.util.HashSet;
class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n01();
    }

    void n01() {
        HashSet<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
          int value = scanner.nextInt();
          if (value == -1) {
            break;
          }
    
          if (value == 1) {
            continue;
          }
    
          set.add(value);
        }
        scanner.close();
    
        for (Integer i : set) {
          System.out.print(i + " ");
        }
    }
}