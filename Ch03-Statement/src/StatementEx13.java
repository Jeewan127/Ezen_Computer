import java.util.Scanner;

public class StatementEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	random함수를 이용하여 1~6까지의 수를 변수에 저장하고 
		 	switch문을 이용하여 각 수에 따른 출력문을 작성하세요.
		 */
		
		Scanner num = new Scanner(System.in);
		
		int number;
		

		number = (int)((Math.random()*10)%6+1);
		
		switch (number) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
		case 6:
			System.out.println("6입니다.");
			break;
		default:
			break;
		}
	}

}
