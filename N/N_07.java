import java.util.Scanner;
import java.util.LinkedList;
class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n07();
    }

    void n07() {
        Scanner scanner = new Scanner(System.in);
    LinkedList<Character> list = new LinkedList<>();

    System.out.println("Please enter a string: ");
    String input = scanner.nextLine();
    for (int i = 0; i < input.length(); i++) {
      list.add(input.charAt(i));
    }

    boolean isPalindrome = true;
    while (list.size() > 1) {
      if (!list.getFirst().equals(list.getLast())) {
        isPalindrome = false;
        break;
      }
      list.removeFirst();
      list.removeLast();
    }

    if (isPalindrome) {
      System.out.println(input);
    } else {
      System.out.println("It is not Palindrome!");
    }
    }
}