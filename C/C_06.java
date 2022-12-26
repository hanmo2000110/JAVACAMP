import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c06();
  }
  void c06(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter points of Korean > ");
    int kor = scanner.nextInt();
    System.out.print("Enter points of English > ");
    int eng = scanner.nextInt();
    System.out.print("Enter points of Math > ");
    int math = scanner.nextInt();
    
    // Calculate total and average scores
    int total = kor + eng + math;
    double average = total / 3.0;
    
    // Determine the grade based on the average score
    String grade;
    if (average >= 90) {
      grade = "A";
    } else if (average >= 80) {
      grade = "B";
    } else if (average >= 70) {
      grade = "C";
    } else if (average >= 60) {
      grade = "D";
    } else {
      grade = "F";
    }
    
    // Print the results
    System.out.println("Total point is " + total);
    System.out.printf("The average is %.1f\n" , average);
    System.out.println("Your grade is " + grade);
    
    scanner.close();
  }
}