import java.util.Scanner;

public class StatementEx30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	사용자에게 숫자하나를 입력받고 숫자만큼 *를 출력
		 */
		
		Scanner num = new Scanner(System.in);
		String numb;
		int number;
		int sum = 0;
		
		System.out.print("숫자를 입력하세요. ");
		numb = num.nextLine();
		number = Integer.parseInt(numb);
		
		for(int i=1; i<number+1; i++) {
			sum += i;
		} System.out.println("합은: " + sum);
	}

}
