import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g02();
    }

    void g02() {
      Scanner scanner = new Scanner(System.in);

    // Declare an array to store the temperature data
    double[] temperatures = new double[10];

    // Read the temperature data and store it in the array
    for (int i = 0; i < temperatures.length; i++) {
      System.out.print("Enter water temperature > ");
      temperatures[i] = scanner.nextDouble();
    }

    // Initialize the counters for each category
    int coldWaterCount = 0;
    int warmWaterCount = 0;
    int hotWaterCount = 0;
    int boilingWaterCount = 0;
    System.out.println();
    // Iterate through the array and classify each temperature
    for (int i = 0; i < temperatures.length; i++) {
      double temperature = temperatures[i];
      if (temperature < 0) {
        System.out.println((i + 1) + "th water temperature is "+ String.format("%.1f",temperature) +" invalid");
      } else if (temperature < 25) {
        System.out.println((i + 1) + "th water temperature is "+ String.format("%.1f",temperature) +" cold water");
        coldWaterCount++;
      } else if (temperature < 40) {
        System.out.println((i + 1) + "th water temperature is "+ String.format("%.1f",temperature) +" warm water");
        warmWaterCount++;
      } else if (temperature < 80) {
        System.out.println((i + 1) + "th water temperature is "+ String.format("%.1f",temperature) +" hot water");
        hotWaterCount++;
      } else {
        System.out.println((i + 1) + "th water temperature is "+ String.format("%.1f",temperature) +" boiling water");
        boilingWaterCount++;
      }
    }
    System.out.println();
    // Print the results
    System.out.println("Count of cold water is " + coldWaterCount);
    System.out.println("Count of warm water is " + warmWaterCount);
    System.out.println("Count of hot water is " + hotWaterCount);
    System.out.println("Count of boiling water is " + boilingWaterCount);
	}
}
