import java.util.Scanner;

/*
  	�л� ��ü�� �����ϰ� �Ʒ��� ������ �߰�
  	
  	�л� ��ü �ȿ��� �л��� ���� ����
  	�̸�, ����, �ּ�
  	
  	�л��� ���� ������ ����ϴ� �޼��带 �ϳ� ����
  	�л���ü�� ����Ͽ� �л��� �̸�, ����, �ּҸ� �Է���
  	�л��� ���� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
 */
public class ObjectEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		
		Scanner sc = new Scanner(System.in);
		
//		sc.nextLine();
		System.out.print("�̸� �Է�: ");
		student.name = sc.nextLine();
		System.out.print("���� �Է�: ");
		student.age = sc.nextInt();
		sc.nextLine();
		System.out.print("�ּ� �Է�: ");
		student.addr = sc.nextLine();
		
		student.printInfo();
		
	}

}
