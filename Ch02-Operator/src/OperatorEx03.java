import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorEx03 {

	public static void main(String[] args) throws IOException {
		
		/*
			����ǰ�� ������ �޴� ����, ȸ���� ���ڸ� �޴� ����
			����ǰ�� ȸ������ ��� �����ְ� � ������ ����ϴ� ���α׷�
			ex) ����ǰ: 120, ȸ����: 10 
			-> �� ������� 12���� �ְ� 0���� ���´�.
				����ǰ: 115, ȸ����: 10
			-> �� ������� 11���� �ְ� 5���� ���´�.
		*/
		
		InputStreamReader br = new InputStreamReader(System.in);
		BufferedReader num = new BufferedReader(br);
		
		int gift, person;
		
		System.out.print("����ǰ�� ������?");
		gift = Integer.parseInt(num.readLine());
		System.out.print("ȸ������?");
		person = Integer.parseInt(num.readLine());
		
//		gift = 115;
//		person = 10;
		
		System.out.println("����ǰ: " + gift);
		System.out.println("ȸ����: " + person);
		System.out.println("�� ����� " + gift/person + "�� �� �ް�" + gift%person + "���� ���´�");
	}

}
