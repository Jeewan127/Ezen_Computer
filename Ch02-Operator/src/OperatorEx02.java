
public class OperatorEx02 {

	public static void main(String[] args) {
		/*
		 ex) ���� �޾ƿ� ���� �ڸ��� �����ڸ��� ���ּ� ����ϱ�
	 		 523 -> 500, 1323 -> 1300
	 		 (������ ����, ���� �����ڸ� �̿�) 
	 	*/
		
		int a = 1523;
		
		a -= a%100;
		
		System.out.println(a);
	}

}
