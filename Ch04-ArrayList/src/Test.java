import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int friend, totalmoney;
		
		friend = sc.nextInt();
		totalmoney = sc.nextInt();
		
		int [] p = new int [friend];
		int [] s = new int [friend];
		int [] sum = new int[friend];
		float [] c = new float[friend];
		float [] csum = new float[friend];
		
		int totalsum=0;
		float coupon;
		
		for(int i=0; i<friend; i++) {
			p[i] = sc.nextInt();
			s[i] = sc.nextInt();
			sum[i] = p[i] + s[i];
			totalsum += sum[i];
		}
		
		for(int i=0; i<friend; i++) {	// ������������ ����
			for(int k=i+1; k<friend; k++) {
				if(sum[k] > sum[i]) {
					int tmp = sum[i];
					sum[i] = sum[k];
					sum[k] = sum[i];
				}
			}
		}
		
		for(int r=0; r<friend; r++) {
			c[r] = (float)sum[r]/2;
		}
		
		// �ϳ��� ���� ���� �� + ������ ������ �� ���ϱ� �� �ֱ�
		
		for(int k=0; k<friend; k++) {
			if(totalsum <= totalmoney) {
				break;
			}
		}
	}
}
