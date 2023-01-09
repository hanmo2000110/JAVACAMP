import java.util.Scanner;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n02();
    }

    void n02() {
         Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> mountains = new HashMap<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("eof")) {
                break;
            }
            String[] parts = line.split(",");
            mountains.put(parts[0], Integer.parseInt(parts[1]));
        }

        for (String key : mountains.keySet()) {
            System.out.println(key + " : " + mountains.get(key) + " m");
        }
    }
}