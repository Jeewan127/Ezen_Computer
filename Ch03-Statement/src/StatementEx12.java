import java.util.Scanner;

public class StatementEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	���� 1���� �Է¹޾� 'a' or 'A' �� ��� 'a('A')�� �Է��ϼ̽��ϴ�.'
		 	'b' or 'B' �� ��� 'b('B')�� �Է��ϼ̽��ϴ�.'�� ���
		 */
		Scanner a = new Scanner(System.in);
		
		String ch;
		
		System.out.print("���ڸ� �Է��ϼ���.");
		ch = a.nextLine();
		
		switch (ch) {
		case "a":
			System.out.println("'a'�� �Է��ϼ̽��ϴ�.");
			break;
		case "A":
			System.out.println("'A'�� �Է��ϼ̽��ϴ�.");
			break;
		case "b":
			System.out.println("'b'�� �Է��ϼ̽��ϴ�.");
			break;
		case "B":
			System.out.println("'B'�� �Է��ϼ̽��ϴ�.");
			break;
		default:
			break;
		}
	}

}
