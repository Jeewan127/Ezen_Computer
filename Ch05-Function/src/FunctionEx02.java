import java.util.Scanner;

public class FunctionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1. 파라미터로 2개의 값을 받고 두 값중에 큰 값을 반환
		 	2. 파라미터로 2개의 값을 받고 두 값중 작은 값을 반환
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력: ");
		int parameter1 = sc.nextInt();
		System.out.print("두 번째 수 입력: ");
		int parameter2 = sc.nextInt();
		
		max(parameter1, parameter2);
		min(parameter1, parameter2);
	}
	
	public static void max(int maxParameter1, int maxParameter2) {
		if(maxParameter1 > maxParameter2) {
			System.out.println("두 수중 큰 수는: " + maxParameter1);
		} else if(maxParameter2 > maxParameter1) {
			System.out.println("두 수중 큰 수는: " + maxParameter2);
		} else {
			System.out.println("두 수는 같습니다.");
		}
	}

	public static void min(int minParameter1, int minParameter2) {
		if(minParameter1 > minParameter2) {
			System.out.println("두 수중 작은 수는: " + minParameter2);
		} else if(minParameter2 > minParameter1) {
			System.out.println("두 수중 작은 수는: " + minParameter1);
		} else {
			System.out.println("두 수는 같습니다.");
		}
	}
}
