import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int [] scores = null;
		int sum = 0;
		float avg = 0f;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 / 2.점수입력 / 3.점수리스트 / 4.분석 / 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택>> ");
		
			int selectNo = sc.nextInt();
		
			if(selectNo == 1) {
				System.out.print("학생수>>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores["+ (i+1) + "]> ");
					scores[i] = sc.nextInt();
					if(max<scores[i]) {
					max = scores[i];
					}
					sum += scores[i];
				}
			} else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+ (i+1) + "]: " + scores[i]);
				}
			} else if(selectNo == 4) {
				avg = (float)sum/studentNum;
				System.out.println("최고점수: " + max);
				System.out.println("평균 점수: " + avg);
			
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
