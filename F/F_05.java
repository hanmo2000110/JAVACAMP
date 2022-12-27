import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f05();
    }

    void f05() {
      List<Integer> obesityIndices = new ArrayList<>(); // Store indices of obese people
        double[] heights = new double[10]; // Store heights in cm
        double[] weights = new double[10]; // Store weights in kg
        Scanner scanner = new Scanner(System.in); // For reading input
        
        // Read input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter height(cm) and weight(kg) ");
            heights[i] = scanner.nextDouble();
            weights[i] = scanner.nextDouble();
        }
        
        // Calculate BMI and check for obesity
        for (int i = 0; i < 10; i++) {
            // Convert height to meters
            double heightInMeters = heights[i] / 100.0;
            // Calculate BMI
            double bmi = weights[i] / (heightInMeters * heightInMeters);
            // Check for obesity
            if (bmi >= 25) {
                obesityIndices.add(i);
            }
        }
        
        // Announce results
        
        for (int i = 0; i < obesityIndices.size(); i++) {
            System.out.printf("%dth person is obesity\n", obesityIndices.get(i) + 1);
        }
      System.out.printf("%d people is obesity: ", obesityIndices.size());
	}
}