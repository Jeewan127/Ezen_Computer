import java.util.Scanner;

public class OperatorEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 	����, ����, ���� ������ �Է��� ������ ����� 3������ ��� ������
		 	���ϴ� ���α׷��� ����ÿ�. ��� ������ 60�� �̸��̸� '����'��
		 	60�� �̻��̸� '�հ�'�� ����ϴ� ���α׷��� ���弼��.
		 */
		
		Scanner math = new Scanner(System.in);
		Scanner eng = new Scanner(System.in);
		Scanner music = new Scanner(System.in);
		
		float mathScore, engScore, musicScore, sum, avg;
		String res;
		
		System.out.print("���������� �Է��ϼ���: ");
		mathScore = math.nextFloat();
		System.out.print("���������� �Է��ϼ���: ");
		engScore = eng.nextFloat();
		System.out.print("���������� �Է��ϼ���: ");
		musicScore = music.nextFloat();
		
		sum = mathScore+engScore+musicScore;
		avg = sum/3;
		
		res = (avg>=60) ? "�հ�" : "����";
		System.out.println("���: " + avg);
		System.out.println("���: " + res);
		
	}

}
