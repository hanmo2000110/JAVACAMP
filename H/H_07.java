import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h07();
    }

    void h07() {
      String input;
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		while(true) {
			System.out.print("=> Enter a sentence ('x' for exit) > ");
			input = sc.nextLine();
			
			if(input.equals("x")) {
				System.out.println("Exit program");
				break;
			}
			
			System.out.println("=> Number of character is " + input.length());
			
			for(i=0; i<input.length(); i++) {
				System.out.println("=> " + input.charAt(i));
			}
			
			System.out.println("===============================");
		}
		
		sc.close();
	}
}