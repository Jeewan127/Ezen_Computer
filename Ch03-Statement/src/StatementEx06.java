import java.util.Scanner;

public class StatementEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 반대로 출력
		Scanner num = new Scanner(System.in);
		
		int gogodan;
		
		System.out.println("구구단");
		System.out.print("숫자를 입력하세요: ");
		
		gogodan = num.nextInt();
		
		for(int i=9; i>0; i--) {
			System.out.println(gogodan + "x" + i + "=" + gogodan*i);
		}
	}

}
