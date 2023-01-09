import java.util.Scanner;

class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] num = new double[10];
		
		System.out.print("Enter 1th score > ");
		num[0] = sc.nextDouble();
		System.out.print("Enter 2th score > ");
		num[1] = sc.nextDouble();
		System.out.print("Enter 3th score > ");
		num[2] = sc.nextDouble();
		System.out.print("Enter 4th score > ");
		num[3] = sc.nextDouble();
		System.out.print("Enter 5th score > ");
		num[4] = sc.nextDouble();
		System.out.print("Enter 6th score > ");
		num[5] = sc.nextDouble();
		System.out.print("Enter 7th score > ");
		num[6] = sc.nextDouble();
		System.out.print("Enter 8th score > ");
		num[7] = sc.nextDouble();
		System.out.print("Enter 9th score > ");
		num[8] = sc.nextDouble();
		System.out.print("Enter 10th score > ");
		num[9] = sc.nextDouble();
		
		double max = Max(num);
		double min = Min(num);
		
		double sum = 0;
		for(int i=0; i<num.length; i++){
			if(num[i] != max && num[i] != min){
				sum += num[i];
			}
		}
		
		double average = sum / 8;
		
		System.out.println("Average is " + average);
		
		sc.close();
	}
	
	public static double Max(double num[]){
		double max = num[0];
		for(int i=1; i<num.length; i++){
			if(max < num[i]){
				max = num[i];
			}
		}
		return max;
	}
	
	public static double Min(double num[]){
		double min = num[0];
		for(int i=1; i<num.length; i++){
			if(min > num[i]){
				min = num[i];
			}
		}
		return min;
	}
}