import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] waterTemperature = new double[10];
		int coldWater = 0;
		int warmWater = 0;
		int hotWater = 0;
		int boilingWater = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter " + (i+1) + "th water temperature > ");
			waterTemperature[i] = sc.nextDouble();			
		}
		
		for (int i = 0; i < 10; i++) {
			switch (AskWater(waterTemperature[i])) {
			case 0:
				System.out.println((i+1) + "th water temperature is " + waterTemperature[i] + " cold water");
				coldWater++;
				break;
			case 1:
				System.out.println((i+1) + "th water temperature is " + waterTemperature[i] + " warm water");
				warmWater++;
				break;
			case 2:
				System.out.println((i+1) + "th water temperature is " + waterTemperature[i] + " hot water");
				hotWater++;
				break;
			case 3:
				System.out.println((i+1) + "th water temperature is " + waterTemperature[i] + " boiling water");
				boilingWater++;
				break;
			}
		}
		
		System.out.println("Count of cold water is " + coldWater);
		System.out.println("Count of warm water is " + warmWater);
		System.out.println("Count of hot water is " + hotWater);
		System.out.println("Count of boiling water is " + boilingWater);
	}
	
	public static byte AskWater(double degree) {
		byte result = 0;
		
		if (degree < 25.0) {
			result = 0;
		} else if (degree < 40.0) {
			result = 1;
		} else if (degree < 80.0) {
			result = 2;
		} else {
			result = 3;
		}
		
		return result;
	}
}