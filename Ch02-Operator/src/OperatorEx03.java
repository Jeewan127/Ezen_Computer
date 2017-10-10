import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorEx03 {

	public static void main(String[] args) throws IOException {
		
		/*
			사은품의 개수를 받는 변수, 회원의 숫자를 받는 변수
			사은품을 회원에게 몇개씩 나눠주고 몇개 남는지 출력하는 프로그램
			ex) 사은품: 120, 회원수: 10 
			-> 한 사람에게 12개씩 주고 0개가 남는다.
				사은품: 115, 회원수: 10
			-> 한 사람에게 11개씩 주고 5개가 남는다.
		*/
		
		InputStreamReader br = new InputStreamReader(System.in);
		BufferedReader num = new BufferedReader(br);
		
		int gift, person;
		
		System.out.print("사은품의 개숫는?");
		gift = Integer.parseInt(num.readLine());
		System.out.print("회원수는?");
		person = Integer.parseInt(num.readLine());
		
//		gift = 115;
//		person = 10;
		
		System.out.println("사은품: " + gift);
		System.out.println("회원수: " + person);
		System.out.println("한 사람당 " + gift/person + "개 씩 받고" + gift%person + "개가 남는다");
	}

}
