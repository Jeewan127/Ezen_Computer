import java.util.Scanner;

public class FunctionEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1: 학생 추가 / 2: 학생 리스트 보기 / 5: 프로그램 종료
		 	학생정보: 이름, 나이, 수학점수
		 	학생을 추가할 수 있는 최대 숫자: 10
		 	
		 	학생 리스트
		 	이름	나이	수학점수
		 	지완	26		100
		 */
		
		Scanner sc = new Scanner(System.in);
		String name [] = new String [10];
		int age [] = new int [10];
		int math [] = new int [10];
		boolean run = true;
			
		for(int i=0; i<age.length; i++) {
			age[i] = 0;
		}
		
		for(int i=0; i<math.length; i++) {
			math[i] = 0;
		}
		
		do {
			printMenu();
			int num = sc.nextInt();
			switch (num) {
			case 1:
				name = studentName(name);
				age = studentAge(age);
				math = studentMath(math);
				break;
			case 2:
				printList(name, age, math);
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
			default:
				break;
			}
		} while(run);
	}
		
	
	public static void printMenu() {
		System.out.println("------------------------------------------");
		System.out.println("1. 학생추가 2.학생 리스트 5. 프로그램 종료");
		System.out.println("------------------------------------------");
		System.out.print(">>>>>>>>>>>>>>>");
	}
	
	public static String[] studentName(String name []) {
		Scanner plus = new Scanner(System.in);
		
		System.out.print("이름: ");
		for(int i=0; i<name.length; i++) {
			if(name[i] == null) {
			name[i] = plus.nextLine();
			break;
			}
		}
		return name;
	}
	
	public static int[] studentAge(int age []) {
		Scanner plus = new Scanner(System.in);
		
		System.out.print("나이: ");
		for(int i=0; i<age.length; i++) {
			if(age[i] == 0) {
			age[i] = plus.nextInt();
			break;
			}
		}
		return age;
	}

	public static int[] studentMath(int math []) {
		Scanner plus = new Scanner(System.in);
		
		System.out.print("수학점수: ");
		for(int i=0; i<math.length; i++) {
			if(math[i] == 0) {
				math[i] = plus.nextInt();
			break;
			}
		}
		return math;
	}
	
	public static void printList(String name [], int age [], int math []) {
		for(int i=0; i<name.length; i++) {
			if(name[i] != null && age[i] != 0 && math[i] != 0) {
				System.out.println("<학생 리스트>");
				System.out.println("이름\t나이\t수학점수");
				System.out.println(name[i] + "\t" + age[i] + "\t" + math[i]);
			}
		}
	}

}
