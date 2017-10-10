import java.util.Scanner;

public class OperatorEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 정수형 변수에 값을 넣는다.
		 변수 값이 0 또는 0 보다작은 값이면 오류
		 그 이외의 값이면 "홀수" or "짝수" 출력
		 */
		
		Scanner num = new Scanner(System.in);
		
		int number;
		String res, res2;
		boolean c;
		
		System.out.println("숫자를 입력하세요: ");
		number = num.nextInt();
		
/*		c = (number > 0);
		number %= 2;
		res = (number == 0) ? "짝수" : "홀수";
		res2 = (c == true) ? res : "오류";   
		System.out.println(res2);*/
		
//		res = (number > 0) ? ((number %2 == 0) ? "짝수" : "홀수") : "오류";
//		System.out.println(res);
		
		res2 = ((number % 2)==0) ? "짝수" : "홀수";
		res = (number <= 0) ? "오류" : res2;
		System.out.println(res);
	}

}
