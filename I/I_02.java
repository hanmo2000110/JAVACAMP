import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i02();
    }

    void i02() {
      Scanner scanner = new Scanner(System.in);

        // 사용자로부터 모양(문자 하 나)과 높이, 여백을 입력받는다.
        System.out.print("Enter a character to draw triangle > ");
        char ch = scanner.next().charAt(0);
        System.out.print("Enter a height of right triangle and blank > ");
        int blanks = scanner.nextInt();
        int size = scanner.nextInt();

        // 메소드를 사용해서 입력한 크기만큼의 여백과 높이를 갖는 우직각 삼각 형을 입력한 문자모양으로 화면에 출력한다.
        for (int i = 30; i > 10; i--) {
            PrintCharWithBlank(i-1, 30 - i + 1, ch);
        }
	 }
  public static void PrintCharWithBlank(int blanks, int size, char ch) {
        // 빈칸 출력
        for (int i = 0; i < blanks; i++) {
            System.out.print(" ");
        }
        // 출력할 문자 출력
        for (int i = 0; i < size; i++) {
            System.out.print(ch);
        }
        // 줄바꿈
        System.out.println();
    }
}