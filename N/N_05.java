import java.util.Scanner;
import java.util.Vector;
class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n05();
    }

    void n05() {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            v.add(num);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int element : v) {
            sb.append((char)element);
        }
        System.out.println(sb.toString());
    }
}