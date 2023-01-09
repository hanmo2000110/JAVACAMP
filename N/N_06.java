import java.util.Scanner;
import java.util.Stack;
class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n06();
    }

    void n06() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        System.out.println("Output:");
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }
}