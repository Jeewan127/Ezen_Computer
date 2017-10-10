import java.util.Scanner;

public class StatementEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	문자 1개를 입력받아 'a' or 'A' 일 경우 'a('A')를 입력하셨습니다.'
		 	'b' or 'B' 일 경우 'b('B')를 입력하셨습니다.'를 출력
		 */
		Scanner a = new Scanner(System.in);
		
		String ch;
		
		System.out.print("문자를 입력하세요.");
		ch = a.nextLine();
		
		switch (ch) {
		case "a":
			System.out.println("'a'를 입력하셨습니다.");
			break;
		case "A":
			System.out.println("'A'를 입력하셨습니다.");
			break;
		case "b":
			System.out.println("'b'를 입력하셨습니다.");
			break;
		case "B":
			System.out.println("'B'를 입력하셨습니다.");
			break;
		default:
			break;
		}
	}

}
