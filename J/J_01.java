import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] birthYears = new int[11];
    int i = 0;
    int year, age, ageGroup;
    
    System.out.print("Enter a birth year of 1th person > ");
    year = scanner.nextInt();
    
    while (year < 2021) {
      birthYears[i] = year;
      age = 2021 - year + 1;
      ageGroup = AskAge(year);
      i++;
      System.out.println("This person is "+age+" years old.");
      System.out.print("Enter a birth year of "+ (i+1) +"th person > ");
      year = scanner.nextInt();
    }
    System.out.println("There are "+countAgeGroup(birthYears, 0)+" babys.");
    System.out.println("There are "+countAgeGroup(birthYears, 1)+" childs.");
    System.out.println("There are "+countAgeGroup(birthYears, 2)+" youths.");
    System.out.println("There are "+countAgeGroup(birthYears, 3)+" youngs.");
    System.out.println("There are "+countAgeGroup(birthYears, 4)+" adults.");
    System.out.println("There are "+countAgeGroup(birthYears, 5)+" olds.");
  }
  
  public static int AskAge(int birthyear) {
    int age = 2021 - birthyear + 1;
    if (age < 7) {
      return 0;
    } else if (age < 13) {
      return 1;
    } else if (age < 20) {
      return 2;
    } else if (age < 30) {
      return 3;
    } else if (age < 60) {
      return 4;
    } else {
      return 5;
    }
  }
  
  public static int countAgeGroup(int[] arr, int ageGroup) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (AskAge(arr[i]) == ageGroup) {
        count++;
      }
    }
    return count;
  }
}