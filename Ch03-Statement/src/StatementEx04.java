import java.util.Scanner;

public class StatementEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	정수형 변수에 숫자를 받고 1~ 입력한 숫자까지 화면엔 출력하는 프로그램
		 */
		
		Scanner num = new Scanner(System.in);
		
		int number;
		System.out.print("숫자를 입력하세요: ");
		number = num.nextInt();
		
		for(int i=1; i<=number; i++){
			System.out.print(i + " ");
		}
	}

}
