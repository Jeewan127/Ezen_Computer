package Test;

import java.util.Scanner;

class BookInfo {
	String name;
	int price, number, num, money=0;
	
	// 클래스 생성자
	public BookInfo(int tmpNum, String tmpName, int tmpPrice, int tmpNumber) {
		num = tmpNum;
		name = tmpName;
		price = tmpPrice;
		number = tmpNumber;
	}
	
	// 도서 구매 
	public void bookGet() { 
		if(number > 0) {
			this.number --;
		} else {
			System.out.println("구매 불가");
		}
	}
	
	// 도서 목록정보
	public void printBookInfo() {
		System.out.println(this.num + "\t" + this.name + "\t" + this.price + "\t" + this.number);
	}
	
	public void getMoney(int getMoney) {
		this.money = this.money + getMoney;
	}
	
	public void spendMoney() {
		if(this.money > this.price) {
			this.money = this.money - this.price;
		} else {
			System.out.println("돈이 부족합니다.");
		}
	}

}

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BookInfo book1 = new BookInfo(1, "Do it android", 20000, 5);
		BookInfo book2 = new BookInfo(2, "Hello Java", 30000, 3);
		BookInfo book3 = new BookInfo(3, "Jsp프로젝트", 15000, 1);
		
		boolean run = true;
		
		do {
			printMenu();
			int num = sc.nextInt(); 
			if(num == 0) {
				System.out.println("번호\t이름\t\t금액\t수량");
				book1.printBookInfo();
				book2.printBookInfo();
				book3.printBookInfo();
			} else if(num == 1) {
				System.out.println("사고싶은 책의번호를 입력하세요 ");
				System.out.println("번호\t이름\t\t금액\t수량");
				book1.printBookInfo();
				book2.printBookInfo();
				book3.printBookInfo();
				System.out.print(">>>>>>>>>> ");
				int getnum = sc.nextInt();
				if(getnum == 1) {
					book1.bookGet();
					book1.spendMoney();
					System.out.println("잔액: " + book1.money);
				} else if(getnum == 2) {
					book2.bookGet();
					book2.spendMoney();
					System.out.println("잔액: " + book2.money);
				} else if(getnum == 3) {
					book3.bookGet();
					book3.spendMoney();
					System.out.println("잔액: " + book3.money);
				}
				
			} else if(num == 2) {
				System.out.print("입금할 금액 입력: ");
				int money = sc.nextInt();
				book1.getMoney(money);
				book2.getMoney(money);
				book3.getMoney(money);
				System.out.println("잔액: " + book1.money);
			} else if(num == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
		} while(run);
			
	}
	public static void printMenu() {
		System.out.println("------------------------------------------------------------------------");
		System.out.println("0: 도서 목록정보 보기\t1: 도서구매\t2: 돈 입금\t5: 프로그램 종료");
		System.out.println("------------------------------------------------------------------------");
		System.out.print("입력: ");
	}
	
}
