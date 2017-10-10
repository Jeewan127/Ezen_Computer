import java.util.Scanner;

public class StatementEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	정수형 변수하나를 만들고 숫자를 입력후 1~그 숫자 까지의 숫자중 짝수만
		 	화면에 출력하는 프로그램
		*/
		
		Scanner num = new Scanner(System.in);
		
		int number;
		System.out.print("숫자를 입력하세요: ");
		number = num.nextInt();
		
		for(int i=1; i<=number; i++) {
			if (i%2==0) {
				System.out.print(i + " ");
			} 
		}
	}

}
