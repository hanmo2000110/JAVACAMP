import java.util.Scanner;
import java.util.TreeMap;
class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n03();
    }

    void n03() {
         TreeMap<String, Double> heights = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (!(input = scanner.nextLine()).equals("eof")) {
            String[] data = input.split(",");
            heights.put(data[0], Double.parseDouble(data[1]));
        }

        heights.forEach((key, value) -> System.out.println(key + " : " + value + " m"));
    }
}