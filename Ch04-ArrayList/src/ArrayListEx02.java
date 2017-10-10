import java.util.Scanner;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 정수형 10짜리 배열을 만들고
		 1~100까지의 랜덤한 수를 차례로 배열에 입력.
		 모든수의 평균을 구하는 프로그램
		 */
		
		int sum = 0;
		int avg = 0;
		int [] number = new int[10];
		
		for(int i=0; i<number.length; i++) {
			number[i] = (int)((Math.random()*100)+1);
			sum += number[i];
		}
		
		for(int k=0; k<number.length; k++) {
			System.out.println(k + "번째 점수는: " + number[k]);
		}
		
		avg = sum/number.length;
		
		System.out.println("평균 점수는: " + avg + "입니다.");
	}

}
