import java.util.Scanner;

class Main {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start_h, start_m, end_h, end_m;
		int totalPrice = 0;
		int count = 1;
		
		while (true) {
			System.out.print("Enter parking start time of " + count + "th car (H M) > ");
			start_h = scan.nextInt();
			start_m = scan.nextInt();
			System.out.print("Enter parking end time of " + count + "th car (H M) > ");
			end_h = scan.nextInt();
			end_m = scan.nextInt();
			
			int price = CalcParking(start_h, start_m, end_h, end_m);
			totalPrice += price;
			
			System.out.println("Parking price : " + price);
			System.out.print("Do you want to enter more? (Y/N) > ");
			String answer = scan.next();
			
			if (answer.equals("N")) {
				System.out.println("Total price for " + count + " cars is " + totalPrice + " won.");
				break;
			}
			count++;
		}
		scan.close();
	}
	
	public static int CalcParking(int start_h, int start_m, int end_h, int end_m) {
		int price = 0;
		int total_time = (end_h - start_h) * 60 + (end_m - start_m);
		price = total_time/10 * 500;
    if(total_time%10 != 0 ) price += 500;
		return price;
	}
}