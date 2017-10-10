import java.util.Scanner;

public class StatementEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	정수형 변수하나를 만들고 숫자를 입력후 1~그 숫자까지의 합을 구하는 프로그램
		*/
		
		Scanner num = new Scanner(System.in);
		
		int number, sum=0;
		
		System.out.print("숫자를 입력하세요: ");
		number = num.nextInt();
		
		for(int i=0; i<=number; i++) {
			sum = sum+i;
		}
		System.out.println("합은? " + sum);
	}

}
