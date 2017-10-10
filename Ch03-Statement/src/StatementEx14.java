import javax.swing.plaf.synth.SynthSeparatorUI;

public class StatementEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1~100까지 반복문을 이용하여 홀수의 합과 짝수의 합을 각각 구하는 프로그램
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
		System.out.println("짝수의 합:" + sum1);
		System.out.println("홀수의 합:" + sum2);
	}

}
