import java.util.Scanner;

class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first day (month day) > ");
		int month1 = sc.nextInt();
		int day1 = sc.nextInt();
		
		System.out.print("Enter second day (month day) > ");
		int month2 = sc.nextInt();
		int day2 = sc.nextInt();
		
		int dayNum1 = CalcDate(month1, day1);
		int dayNum2 = CalcDate(month2, day2);
		
		if(dayNum1 == -1 || dayNum2 == -1) {
			System.out.println("Invalid input!");
		} else {
			int result = Math.abs(dayNum1 - dayNum2);
			System.out.println("The interval between two dates is " + result + " days.");
		}
	}
	
	public static int CalcDate(int month, int day) {
		int[] monthdays = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(month < 1 || month > 12 || day < 1 || day > monthdays[month-1]) {
			return -1;
		}
		
		int result = day;
		for(int i=0; i<month-1; i++) {
			result += monthdays[i];
		}
		
		return result;
	}
}