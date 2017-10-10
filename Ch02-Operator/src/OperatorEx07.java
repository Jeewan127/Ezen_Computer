import java.util.Scanner;

public class OperatorEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 	수학, 영어, 음악 점수를 입력한 변수를 만들고 3과목의 평균 점수를
		 	구하는 프로그램을 만드시오. 평균 점수가 60점 미만이면 '과락'을
		 	60점 이상이면 '합격'을 출력하는 프로그램을 만드세요.
		 */
		
		Scanner math = new Scanner(System.in);
		Scanner eng = new Scanner(System.in);
		Scanner music = new Scanner(System.in);
		
		float mathScore, engScore, musicScore, sum, avg;
		String res;
		
		System.out.print("수학점수를 입력하세요: ");
		mathScore = math.nextFloat();
		System.out.print("영어점수를 입력하세요: ");
		engScore = eng.nextFloat();
		System.out.print("음악점수를 입력하세요: ");
		musicScore = music.nextFloat();
		
		sum = mathScore+engScore+musicScore;
		avg = sum/3;
		
		res = (avg>=60) ? "합격" : "과락";
		System.out.println("평균: " + avg);
		System.out.println("결과: " + res);
		
	}

}
