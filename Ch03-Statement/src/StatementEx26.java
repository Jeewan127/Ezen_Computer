import java.util.Scanner;

public class StatementEx26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner num = new Scanner(System.in);
		
		int [] number = new int[5];
		
		System.out.println(number.length + "명의 시험 점수를 입력하십시오.");
		
		for(int i=0; i<number.length; i++) {
			String str = num.nextLine();
			number[i] = Integer.parseInt(str);
		}
		
		for(int i=0; i<number.length-1; i++) {         // 큰 순서대로 나열
			for(int k=i+1; k<number.length; k++) {
				if(number[k]>number[i]) {
					int tmp = number[i];
					number[i] = number[k];
					number[k] = tmp;
				}
			}
		}
		
		for(int j=0; j<number.length; j++) {
			System.out.println((j+1) + "번째 사람의 점수는" + number[j] + "입니다.");
		}
		System.out.println("가장 높은 점수는" + number[0] + "입니다.");
		int sum = 0;
		for(int a=0; a<number.length; a++) {
			sum += number[a];
		}
		System.out.println("합계 점수는" + sum);
		System.out.println("평균 점수는" + (float)sum/5);
		
	}
}

