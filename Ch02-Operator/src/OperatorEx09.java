import java.util.Scanner;

public class OperatorEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	�� ������ bmi���� ���� ǥ��, ��ü��, �浵��, ������ ������ ���
		 */
		
		Scanner na = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		Scanner he = new Scanner(System.in);
		Scanner we = new Scanner(System.in);
		
		String name, sex, res, res1, res2, res3;
		float height, weight, bmi;
		
		
		System.out.print("�̸���? ");
		name = na.nextLine();
		System.out.print("������? ");
		sex = s.nextLine();
		System.out.print("Ű��? ");
		height = he.nextFloat();
		System.out.print("�����Դ�? ");
		weight = we.nextFloat();
		
		bmi = (weight/(height*height))*10000;
		
/*		res = (bmi<23) ? "����" : ((bmi>=23) && (bmi<25)) ? "��ü��" : 
			((bmi>=25) && (bmi<30)) ? "�浵��" : "��";*/
		
		res3 = ((bmi >= 25) && (bmi<30)) ? "�浵��" : "��";
		res2 = ((bmi >= 23) && (bmi<25)) ? "��ü��" : res3;
		res1 = (bmi < 23) ? "����" : res2;
		
		System.out.println("�̸�: " + name);
		System.out.println("����: " + sex);
		System.out.println("Ű: " + height);
		System.out.println("������: " + weight);
		System.out.println("bmi: " + bmi);
		System.out.println("bmi���: " + res1);
	}

}
