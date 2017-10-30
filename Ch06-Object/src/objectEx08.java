import java.util.Scanner;

public class objectEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String email;
		
		System.out.print("이메일 입력: ");
		email = sc.nextLine();
		
		if(email.indexOf("@") == -1) {
			System.out.println("잘못된 이메일 형식입니다.");
		} else {
			System.out.println(email);
		}
	} 

}
