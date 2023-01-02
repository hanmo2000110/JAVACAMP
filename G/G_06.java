import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g06();
    }

    void g06() {
      Scanner sc = new Scanner(System.in); 
        
        int[] order = {0,0,0}; // 입력받는 구매 제품 개수 리스트 [가죽장갑, 털장갑, 비닐장갑]
        int sale; // 계산한 판매금액
        int total_sale = 0; // 총 매출액 총액
        int[] total_order = {0,0,0}; // 총 판매 개수 리스트 [가죽장갑, 털장갑, 비닐장갑]
        int[] price = {10000, 6000, 3000}; // 제품별 가격
        int i; // 반복문을 위한 변수
        
        System.out.println("There are three type of products");
        System.out.println("(1. Leather gloves, 2. Wool gloves, 3. Vinyl gloves)\n");
        
        while (true) { 
            System.out.print("How many first products do you want to buy? > "); 
            order[0] = sc.nextInt(); 
            System.out.print("How many second products do you want to buy? > "); 
            order[1] = sc.nextInt(); 
            System.out.print("How many third products do you want to buy? > "); 
            order[2] = sc.nextInt(); 
            
            sale = 0; 
            for (i = 0; i < 3; i++) { 
                sale += order[i] * price[i]; 
            } 
            total_sale += sale; 
            for (i = 0; i < 3; i++) { 
                total_order[i] += order[i]; 
            } 
            if (order[0] == 0 && order[1] == 0 && order[2] == 0) { 
                break; 
            } else { 
                System.out.println("The price is " + sale); 
                System.out.println();
            } 
        } 
        
        System.out.println("Total price from now on is " + total_sale); 
        System.out.println("You sold " + total_order[0] + " Leather gloves, " + total_order[1] + " Wool gloves, " + total_order[2] + " Vinyl gloves."); 
	}
}
