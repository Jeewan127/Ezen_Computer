
public class StatementEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	������ ������ 1~8������ ���� �����ϰ� �ް�
		 	�������� 5�� ������ ���α׷��� ����, �� �ܿ� ���� ������ ȭ�鿡 ���
		 */
		
		int num=0;
		
		while (num!=5)  {
			num = (int)((Math.random()*8)+1); // 1~8���� �������� ���
			if(num!=5) {
				System.out.println(num);
			} else {
				System.out.println("���α׷��� ����˴ϴ�.");
			}
		}
	}
}
