import java.util.Scanner;

/*
  	�л� ��ü�� �����ϰ� �Ʒ��� ������ �߰�
  	
  	�л� ��ü �ȿ��� �л��� ���� ����
  	�̸�, ����, �ּ�
  	
  	�л��� ���� ������ ����ϴ� �޼��带 �ϳ� ����
  	�л���ü�� ����Ͽ� �л��� �̸�, ����, �ּҸ� �Է���
  	�л��� ���� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
 */

class Student {
	
	String name;
	int age;
	String juso;
	
	public void printInfo() {
		System.out.println("�̸�\t����\t�ּ�");
		System.out.println(name + "\t" + age + "\t" + juso);
	}
	
}
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
		student.juso = sc.nextLine();
		
		student.printInfo();
		
	}

}
