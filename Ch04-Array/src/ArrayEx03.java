
public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	������ 10¥�� �迭
		 	1~100������ ������ ���� ���ʷ� �迭�� �Է�
		 	10���� ������ ȭ�鿡 ���
		 	���� ���� ū ���� ���ϼ���.
		 */
		
		int [] num = new int [10];
		int min=100;
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
			if(min > num[i]) {
				min=num[i];
			}
		}
		
		for(int k=0; k<num.length; k++) {
			System.out.println((k+1) + "��° ����: " + num[k]);
		}
		
		for(int r=0; r<num.length; r++) {
			for(int j=r+1; j<num.length; j++) {
				if(num[j] > num[r]) {
					int tmp = num[j];
					num[j] = num[r];
					num[r] = tmp;
				}
			}
		}
		System.out.println("min: " + min);
		System.out.println("���� ū����: " + num[9] + "�Դϴ�.");
	}

}
