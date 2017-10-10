import java.util.Scanner;

public class OperatorEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	위 문제의 bmi값에 따라 표준, 과체중, 경도비만, 비만으로 나누어 출력
		 */
		
		Scanner na = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		Scanner he = new Scanner(System.in);
		Scanner we = new Scanner(System.in);
		
		String name, sex, res, res1, res2, res3;
		float height, weight, bmi;
		
		
		System.out.print("이름은? ");
		name = na.nextLine();
		System.out.print("성별은? ");
		sex = s.nextLine();
		System.out.print("키는? ");
		height = he.nextFloat();
		System.out.print("몸무게는? ");
		weight = we.nextFloat();
		
		bmi = (weight/(height*height))*10000;
		
/*		res = (bmi<23) ? "정상" : ((bmi>=23) && (bmi<25)) ? "과체중" : 
			((bmi>=25) && (bmi<30)) ? "경도비만" : "비만";*/
		
		res3 = ((bmi >= 25) && (bmi<30)) ? "경도비만" : "비만";
		res2 = ((bmi >= 23) && (bmi<25)) ? "과체중" : res3;
		res1 = (bmi < 23) ? "정상" : res2;
		
		System.out.println("이름: " + name);
		System.out.println("성별: " + sex);
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
		System.out.println("bmi: " + bmi);
		System.out.println("bmi등급: " + res1);
	}

}
