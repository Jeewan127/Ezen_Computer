import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Ex_Student> students = new HashMap<>();
		
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
				System.out.print("이름: ");
				str1 = sc.nextLine();
				System.out.print("폰번호: ");
				str2 = sc.nextLine();
				
				Ex_Student student = new Ex_Student(str1, str2);
				students.put(number, student);
				number ++;
			} else if(num == 1) {
				System.out.println("번호\t이름\t폰번호");
				Iterator<Integer> keys = students.keySet().iterator();
				while(keys.hasNext()) {
					Integer key = keys.next();
					System.out.print(key + "\t");
					students.get(key).printInfo();
				}
			} else if(num == 2) {
				System.out.println("삭제할 번호: ");
				num = sc.nextInt();
				students.remove(num-1);
			} else if(num == 3) {
				sc.nextLine();
				System.out.print("번호 입력: ");
				str1 = sc.nextLine();
				System.out.println("번호\t이름\t폰번호");
				
				Iterator<Integer> keys = students.keySet().iterator();
				while(keys.hasNext()) {
					Integer key = keys.next();
					if (students.get(key).getName().contains(str1)) {
						students.get(key).printInfo();
					}
				}
			} else if(num == 4) {
				students.clear();
			} else if(num == 5) {
				System.out.println("종료");
			}
		} while(num != 5);
	}
	public static void printMenu() {
		System.out.println("0: 등록 1: 보기 2: 선택삭제 3: 검색 4: 전체삭제 5: 종료");
		System.out.print("입력: ");
	}
}
