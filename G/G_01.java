import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g01();
    }

    void g01() {
        Scanner scan = new Scanner(System.in);
        int[] ages = new int[100];
        int count = 0;
        while (true) {
            System.out.print("Enter a birth year of " + (count + 1) + "th person > ");
            int year = scan.nextInt();
            if (year > 2021) {
                break;
            }
            ages[count] = 2021 - year + 1;
            count++;
        }
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "th person are " + ages[i] + " years old.");
        }

        int babyCount = 0;
        int childCount = 0;
        int youthCount = 0;
        int youngCount = 0;
        int adultCount = 0;
        int oldCount = 0;
        for (int i = 0; i < count; i++) {
            if (ages[i] < 7) {
                babyCount++;
            } else if (ages[i] < 13) {
                childCount++;
            } else if (ages[i] < 20) {
                youthCount++;
            } else if (ages[i] < 30) {
                youngCount++;
            } else if (ages[i] < 60) {
                adultCount++;
            } else {
                oldCount++;
            }
        }
        System.out.println();
        System.out.println("There are " + babyCount + " babys.");
        System.out.println("There are " + childCount + " childs.");
        System.out.println("There are " + youthCount + " youths.");
        System.out.println("There are " + youngCount + " youngs.");
        System.out.println("There are " + adultCount + " adults.");
        System.out.println("There are " + oldCount + " olds.");

    }
}