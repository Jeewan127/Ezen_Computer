
public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	정수형 10짜리 배열
		 	1~100까지의 랜덤한 수를 차례로 배열에 입력
		 	10개의 정수를 화면에 출력
		 	그중 가장 큰 값을 구하세요.
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
			System.out.println((k+1) + "번째 수는: " + num[k]);
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
		System.out.println("가장 큰수는: " + num[9] + "입니다.");
	}

}
