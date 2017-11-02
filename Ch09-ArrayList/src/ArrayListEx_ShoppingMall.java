import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx_ShoppingMall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Shopping> shops = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int number = 1;
		String str = "";
		
		
		
		do{ 
			printMenu();
			num1 = sc.nextInt();
			
			if(num1 == 0) {
				sc.nextLine();
				System.out.print("상품 이름: ");
				str = sc.nextLine();
				System.out.print("가격: ");
				num1 = sc.nextInt();
				System.out.print("수량: ");
				num2 = sc.nextInt();
				
				Shopping shop = new Shopping(number, str, num1, num2);
				shops.add(shop);
				number++;
			} else if(num1 == 1) {
				System.out.println("번호\t상품\t가격\t수량");
				for(int i=0; i<shops.size(); i++) {
					shops.get(i).printInfo();
				}
			} else if(num1 == 2) {
				System.out.print("삭제할 번호: ");
				num1 = sc.nextInt();
				shops.remove(num1-1);
			} else if(num1 == 3) {
				sc.nextLine();
				System.out.print("검색할 상품: ");
				str = sc.nextLine();
				System.out.println("번호\t상품\t가격\t수량");
				for(Shopping shop : shops) {
					if(shop.getName().contains(str)) {
						shop.printInfo();
					}
				}
			} else if(num1 == 5) {
				System.out.println("종료");
			}	
		} while(num1 != 5);
		
		
	}
	public static void printMenu() {
		System.out.println("0: 등록 1: 보기 2: 삭제 3: 검색 5: 종료");
		System.out.print("입력: ");
	}
}
