import java.util.Scanner;

public class OperatorEx04 {

	public static void main(String[] args) {
		/*
		 숫자를 입력받아 100~300사이면 false를 , 나머지는 true 출력
		 */
		
		Scanner num = new Scanner(System.in);
		
		int number, i;

		while(true) {
		System.out.print("숫자를 입력하세요: ");
		number = num.nextInt();
		
		System.out.println((number<=100) || (number>=300));
		
		if(number == 0)
			break;
		}
	}
}
