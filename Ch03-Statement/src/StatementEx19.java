
public class StatementEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1~10������ ���� �����ϰ� �ް� 10�� ���ö� ���� �Ʒ����۾��� �ݺ�
		 	������ ������ ���� ������ ��� �ش��ϴ� ���ڸ� ���
		 */
		
		int num=0;
		
		while(num!=10) {
			num = (int)(Math.random()*10)+1;
			System.out.print(num + " ");
			if(num==1) {
				System.out.println("*");
			} else if(num==2) {
				System.out.println("o");
			} else if(num==3) {
				System.out.println("x");
			} else if(num==10){
				break;
			} else {
				System.out.println("@");
			}
		}
	}
}
