import java.util.Scanner;

public class StatementEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	�̸�, ����('m' or 'f'), Ű, �����Ը� ���� �����Ѵ� ������ �ϳ� �����
	 		bmi�� ����Ͽ� �Ʒ��� ���� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
	 		(bmi����: (������/Ű*Ű)*10000)
	 		bmi���� ���� ǥ��, ��ü��, �浵��, ������ ������ ���
	 	*/
		
		Scanner na = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		Scanner he = new Scanner(System.in);
		Scanner we = new Scanner(System.in);
		
		String name, sex;
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
		
		System.out.println("�̸�: " + name);
		System.out.println("����: " + sex);
		System.out.println("Ű: " + height);
		System.out.println("������: " + weight);
		System.out.println("bmi: " + bmi);
		
		if (bmi < 23) {
			System.out.println("bmi���: ����");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("bmi���: ��ü��");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("bmi���: �浵��");
		} else {
			System.out.println("bmi���: ��");
		}
	}

}
