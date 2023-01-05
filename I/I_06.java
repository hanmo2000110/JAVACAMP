import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Main stepI = new Main();
      stepI.i06();
  }

  void i06() {
    Scanner sc = new Scanner(System.in);
		int big=0, normal=0, small=0;
		
		System.out.println("Generating 10 numbers...");
		
		for(int i=0; i<10; i++) {
			int random = GetRandom();
			System.out.println("Generated random number is "+random);
			
			if(random >= 70) {
				big++;
			}
			else if(random >= 40 && random < 70) {
				normal++;
			}
			else {
				small++;
			}
		}
		
		System.out.println("1. Big (>= 70) : "+big);
		System.out.println("2. Normal (>= 40) : "+normal);
		System.out.println("3. Small (< 40) : "+small);
	}
  public static byte GetRandom() {
		int random = (int)(Math.random()*100)+1;
		return (byte)random;
	}
}