import java.util.Scanner;

public class OperatorEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	�̸�, ����('m' or 'f'), Ű, �����Ը� ���� �����Ѵ� ������ �ϳ� �����
		 	bmi�� ����Ͽ� �Ʒ��� ���� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
		 	(bmi����: (������/Ű*Ű)*10000)
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
		
	}

}
