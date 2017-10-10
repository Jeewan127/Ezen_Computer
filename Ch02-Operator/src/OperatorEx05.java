import java.util.Scanner;

public class OperatorEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 학생의 점수를 입력받아
		 학생의 점수가 60점 이상이면 합격 60점 미만이면 불합격을 출력하는 프로그램
		 (단, 학생의 점수가 0~100사이가 아니라면 오류출력)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		String res, res2;
		
		System.out.print("점수를 입력하세요: ");
		score = sc.nextInt();
		
		/*if ((score >= 0) && (score <= 100) ) {
			res = (score >= 60) ? "합격" : "불합격";
			System.out.println(res);
		} else {
			System.out.println("오류");
			return;
		}*/ 	
		
		res = ((score >= 0) && (score <= 100)) ? 
				((score >= 60) ? "합격" : "불합격") : "오류";
//		res2 = ((score >= 0) && (score <= 100)) ? res : "오류"; 
		System.out.println(res);
		
	
				
	}

}
