import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h09();
    }

    void h09() {
      String input;
      Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("=============================");
            System.out.print("Enter string ('x' for exit) > ");
            input = s.nextLine();
            if(input.equals("x")) {
                System.out.println("Exit program");
                break;
            }
            String userList[] = input.split("###");
            int numPeople = userList.length;
            System.out.println("Total number of people is " + numPeople);
            for(int i = 0; i < userList.length; i++){
                String userInfo[] = userList[i].split("\\|");
                System.out.println((i + 1) + " " + userInfo[0] + " " + userInfo[1]);
            }
        }
	}
}