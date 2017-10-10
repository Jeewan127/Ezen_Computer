import java.util.Scanner;

public class OperatorEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	이름, 성별('m' or 'f'), 키, 몸무게를 각각 저장한는 변수를 하나 만들고
		 	bmi를 계산하여 아래와 같이 출력되는 프로그램을 작성하시오.
		 	(bmi공식: (몸무게/키*키)*10000)
		 */
		
		Scanner na = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		Scanner he = new Scanner(System.in);
		Scanner we = new Scanner(System.in);
		
		String name, sex;
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
		
		System.out.println("이름: " + name);
		System.out.println("성별: " + sex);
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
		System.out.println("bmi: " + bmi);
		
	}

}
