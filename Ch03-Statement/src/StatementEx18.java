import javax.swing.plaf.synth.SynthSeparatorUI;

public class StatementEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	2���� ������ ���� ������ ���� �����ϰ�
		 	�� ���� ���� Ȧ���̸� �� ���� ���� ȭ�鿡 ����ϰ�
		 	�� ���� ���� Ȧ���̸� �� ���� ���� ȭ�鿡 ����ϰ� ���α׷� ����
		 */
		
		int a, b;
		
		while(true) {
			a = (int)(Math.random()*100);
			b = (int)(Math.random()*100);
			
			if((a+b)%2==1) {
				System.out.println("a:" + a + " b: " + b);
				System.out.println(a+b);
			} else if(a>b) {
				System.out.println("a:" + a + " b: " + b);
				if((a-b)%2==1) {
				System.out.println(a-b);
				} else {
					System.out.println("�ش����");
				}
				break;
			} else if(b>a) {
				System.out.println("a:" + a + " b: " + b);
				if((b-a)%2==1) {
				System.out.println(b-a);
				} else {
					System.out.println("�ش����");
				}
				break;
			} else {
				System.out.println("�ش����");
				break;
			}
		}
	}

}
