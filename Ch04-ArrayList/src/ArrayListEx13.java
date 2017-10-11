import java.util.Scanner;

public class ArrayListEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		
		// 1차 배열로 day 선언
		String [] week = {"일", "월", "화", "수", "목", "금", "토"};
		
		// day 출력
		for(int i=0; i<week.length; i++) {
			System.out.print(week[i] + "\t" );
		}
		
		System.out.println();
		
		// 2차 배열 생성
		int [][] day = new int [5][7];
		
		for(int i=0; i<5; i++) {
			for(int k=0; k<7; k++) {
				day[i][k] = num;
				num ++;
			}
		}
		
		// 달력 출력
		for(int r=0; r<5; r++) {
			for(int e=0; e<7; e++) {
				if(day[r][e] <= 31) {
				System.out.print(day[r][e] + "\t");
				} else {
					break;
				}
			}
			System.out.println();
		}
	}
}
