import java.util.Scanner;

public class StatementEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	정수하나를 입력받아 그 숫자가 홀수이면 '홀수' 짝수이면 '짝수'를 출력
		*/
		
		Scanner num = new Scanner(System.in);
		
		int number, n;
		
		System.out.print("정수를 입력하세요: ");
		number = num.nextInt();
		n = number%2;
		
		if (n==0) {
			System.out.println("짝수입니다.");
		}
		if (n==1) {
			System.out.println("홀수입니다.");
		}
	}
}
