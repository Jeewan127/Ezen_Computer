import java.util.Scanner;

public class StatementEx20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 구구단
		
		Scanner num = new Scanner(System.in);
		
		int number;
		
		System.out.print("구구단을 입력하세요: ");
		number = num.nextInt();
		System.out.println(number + "단 입니다.");
		
		for(int i=1; i<10; i++) {
			System.out.println(number + "X" + i + "= " + (number*i));
		}
	}

}
