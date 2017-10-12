import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		
		int [] number;
		int sum=0;
		int avg=0;
		number = new int[10];
		
		for(int i=0; i<number.length; i++) {
			System.out.print((i+1) + "번째 학생의 수학점수를 입력하세요: ");
			String score = num.nextLine();
			number[i] = Integer.parseInt(score);
		}
		
		for(int k=0; k<number.length; k++) {
			sum += number[k];
		}
		
		avg = sum/number.length;
		System.out.println("이 반의 평균 수학 점수는: " + avg + "입니다.");
		
	}

}
