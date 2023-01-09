import java.util.Scanner;
import java.util.LinkedList;
class Main {
    public static void main(String[] args) {
        Main stepN = new Main();
        stepN.n04();
    }

    void n04() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        // 정수형 데이터 사용자 입력을 받아 LinkedList 에 저장하라. 사용자 입력은 -1 로 끝난다.
        while (true) {
            int num = scanner.nextInt();
            if (num == -1)
                break;
            linkedList.add(num);
        }

        // 맨 처음 데이터를 출력 후 삭제하고 맨 마지막 데이터를 출력 후 삭제하라. 그리고 이것을 LinkedList 가 텅 빌 때까지 반복하라.
        while (!linkedList.isEmpty()) {
            System.out.print(linkedList.removeFirst() + " ");
            if (!linkedList.isEmpty())
                System.out.print(linkedList.removeLast() + " ");
        }
    }
}