import java.util.Scanner;

public class OperatorEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 �л��� ������ �Է¹޾�
		 �л��� ������ 60�� �̻��̸� �հ� 60�� �̸��̸� ���հ��� ����ϴ� ���α׷�
		 (��, �л��� ������ 0~100���̰� �ƴ϶�� �������)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		String res, res2;
		
		System.out.print("������ �Է��ϼ���: ");
		score = sc.nextInt();
		
		/*if ((score >= 0) && (score <= 100) ) {
			res = (score >= 60) ? "�հ�" : "���հ�";
			System.out.println(res);
		} else {
			System.out.println("����");
			return;
		}*/ 	
		
		res = ((score >= 0) && (score <= 100)) ? 
				((score >= 60) ? "�հ�" : "���հ�") : "����";
//		res2 = ((score >= 0) && (score <= 100)) ? res : "����"; 
		System.out.println(res);
		
	
				
	}

}
