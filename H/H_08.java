import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Main stepH = new Main();
      stepH.h08();
  }

  void h08() { 
    Scanner input = new Scanner(System.in);
        String sentence;
        String findStr;
        String replaceStr;

        while(true) {
          System.out.println("===============================");
            System.out.print("=> Enter a sentence ('x' for exit) > ");
            sentence = input.nextLine();
            
            if(sentence.equals("x")) {
                System.out.println("Exit program");
                break;
            }
            
            System.out.print("=> Enter a sentence to find > ");
            findStr = input.nextLine();
            System.out.print("=> Enter a sentence to replace > ");
            replaceStr = input.nextLine();
            
            int count = 0;
            int index = 0;
            while(true) {
                index = sentence.indexOf(findStr, index);
                if(index == -1) {
                    break;
                }
                else {
                    count++;
                    sentence = sentence.substring(0, index) + replaceStr + sentence.substring(index + findStr.length());
                    index += replaceStr.length();
                }
            }
            System.out.println("=> The replacement occurred " + count + " times\n=> " + sentence);
        }
  }
}