import javax.swing.plaf.synth.SynthSeparatorUI;

public class StatementEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1~100���� �ݺ����� �̿��Ͽ� Ȧ���� �հ� ¦���� ���� ���� ���ϴ� ���α׷�
		 */
		
		int sum1=0;
		int sum2=0;
		
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 +i;
			}
		}
		System.out.println("¦���� ��:" + sum1);
		System.out.println("Ȧ���� ��:" + sum2);
	}

}
