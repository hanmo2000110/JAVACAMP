import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepI = new Main();
        stepI.i05();
    }
    static int[] nums = new int[10];
    void i05() {
      Scanner scanner = new Scanner(System.in);
  		System.out.println("Find the maximum of 10 numbers");
  		
  		
  		
  		for (int i = 0; i < 10; i++) {
  			System.out.print("Enter " + (i + 1) + "th number > ");
  			nums[i] = scanner.nextInt();
  		}
  		
  		System.out.println("\nMaximum value is " + MaxOfTen());
  		scanner.close();
    }
  
  public static int MaxOfTen() {
		int max = 0;
		
		for (int i = 0; i < 10; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		
		return max;
	}
}