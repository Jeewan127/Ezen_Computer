import java.util.Scanner;

public class ObjectEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String number;
		
		System.out.print("�ֹι�ȣ �Է�: ");
		
		number = sc.nextLine();
		
		String num1 = number.substring(0, 4);
		String num2 = number.substring(4, 6);
		String num3 = number.substring(6, 8);
		String num4 = number.substring(8, 9);
		
		if(Integer.parseInt(num4) == 1) {
			System.out.println(num1 + "�� " + num2 + "�� " + num3 + "��");
			System.out.println("����: ����");
		} else if(Integer.parseInt(num4) == 2) {
			System.out.println(num1 + "�� " + num2 + "�� " + num3 + "��");
			System.out.println("����: ����");
		}
		

		
	}

}
