import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> books = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int number = 1;
		
		String str1 = "";
		String str2 = "";
		
		do {
			printMenu();
			num = sc.nextInt();
			
			if(num==0) {
				sc.nextLine();
				System.out.print("책 이름: ");
				str1 = sc.nextLine();
				System.out.print("가격: ");
				num = sc.nextInt();
				sc.nextLine();
				System.out.print("출판사 이름: ");
				str2 = sc.nextLine();
				
				Book book = new Book(number, str1, num, str2);
				books.add(book);
				number ++;
			} else if(num == 1) {
				System.out.println("번호\t이름\t가격\t출판사");
				for(int i=0; i<books.size(); i++) {
					books.get(i).printInfo();
				}
			} else if(num == 2) {
				System.out.println("삭제할 번호: ");
				num = sc.nextInt();
				books.remove(num-1);
			} else if(num == 3) {
				sc.nextLine();
				System.out.println("이름으로 책 검색");
				System.out.print("이름입력: ");
				str1 = sc.nextLine();
				for(Book a : books) {
					if(a.getName().contains(str1)) {
						a.printInfo();
					}
				}
				
			} else if(num == 4) {
				books.clear();
			} else if(num == 5) {
				System.out.println("종료");
			}
		} while(num != 5);
		
	}
	public static void printMenu() {
		System.out.println("0: 책등록 1: 목록보기 2: 책삭제 3: 책 검색 4: 전체삭제 5: 종료");
		System.out.print("입력: ");
	}
	
	
}
