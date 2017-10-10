import java.util.Scanner;

public class StatementEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	정수를 입력받아 1~그 숫자까지의 정수중에서 3의 배수의 총합을 구하기
		 */
		
		Scanner num = new Scanner(System.in);
		
		int number, sum=0;
		
		System.out.print("숫자를 입력하세요: ");
		number = num.nextInt();
		
		for(int i=0; i<number; i=i+3) {
			sum = sum + i;
		}
		System.out.println("합은: " + sum);
	}

}
