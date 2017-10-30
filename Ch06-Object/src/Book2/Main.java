package Book2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		int category = 3;
		int number = 2;
		
		String[] categoryName = {"요리책","자동차책","수학책"};
		Book [][] books = new Book [category][number]; 
		
		books[0][0] = new Book(1, "cookBook1", 1000);
		books[0][1] = new Book(2, "cookBook2", 2000);
		
		books[1][0] = new Book(3, "carBook1", 1500);
		books[1][1] = new Book(4, "carBook2", 2500);
		
		books[2][0] = new Book(5, "mathBook1", 3000);
		books[2][1] = new Book(6, "mathBook2", 4000);
		
		do{
			printMenu();
			num = sc.nextInt();
			
			if(num>=0 && num<=2) {
				printBooks(books, num, categoryName);
			} else if(num==3) {
				printAll(books, categoryName);
			} else if(num==5) {
				System.out.println("종료");
			}
		} while(num != 5);
		
	}
	
	public static void printAll(Book[][] books, String [] categoryName) {
		System.out.println("번호\t이름\t\t가격");
		for(int i=0; i<books.length; i++) {
			System.out.println(categoryName[i]);
			for(int k=0; k<books[i].length; k++) {
				books[i][k].bookInfo();
			}
		} System.out.println();
	}
	
	public static void printBooks(Book[][] books, int num, String [] categoryName) {
		System.out.println(categoryName[num]);
		System.out.println("번호\t이름\t\t가격");
		for(int i=num; i<num+1; i++) {
			for(int k=0; k<books[num].length; k++) {
				books[num][k].bookInfo();
			}
		}
	}
	
	public static void printMenu() {
		System.out.println("0: 요리   1: 자동차   2: 수학   3: 전체보기   5: 종료");
		System.out.print(">>>>>>>>> ");
	}

}
