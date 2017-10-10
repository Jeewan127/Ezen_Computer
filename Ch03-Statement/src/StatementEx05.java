import java.util.Scanner;

public class StatementEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	구구단
		 	2~9까지의 수를 저장하는 변수
		 	그 변수가 저장된 구구단을 출력하세요.
		 */
		
		Scanner num = new Scanner(System.in);
		
		int gogodan;
		
		System.out.println("구구단");
		System.out.print("숫자를 입력하세요: ");
		
		gogodan = num.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(gogodan + "x" + i + "=" + gogodan*i);
		}
	}

}
