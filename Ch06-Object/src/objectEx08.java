import java.util.Scanner;

public class objectEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String email;
		
		System.out.print("�̸��� �Է�: ");
		email = sc.nextLine();
		
		if(email.indexOf("@") == -1) {
			System.out.println("�߸��� �̸��� �����Դϴ�.");
		} else {
			System.out.println(email);
		}
	} 

}
