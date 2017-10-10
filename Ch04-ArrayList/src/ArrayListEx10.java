import java.util.Scanner;

public class ArrayListEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1. 사용자에게 행과 열값을 입력 받는다.
		 	2. 행과 열 값을 이용하여 2차배열을 생성한다.
		 	3. 2차 배열에 0 or 1값을 랜덤하게 받는다.
		 	4. 2차 배열을 아래의 규칙에 따라 화면에 출력한다.
		 	ex) 0-># / 1->@
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값 입력: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int [][] num = new int[first][second];
		
		for(int i=0; i<first; i++) {
			for(int r=0; r<second; r++) {
				num[i][r] = (int)(Math.random()*2);
				if(num[i][r] == 0) {
					System.out.print("#");
				} else if(num[i][r] == 1) {
					System.out.print("@");
				}
			}
			System.out.println();
		}
	}

}
