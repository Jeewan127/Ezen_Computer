import java.util.Scanner;

public class FunctionEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1차 배열 1개를 만들고 숫자를 랜덤하게 넣는다
		 	사용자가 숫자하나를 입력(0~9)
		 	사용자가 입력한 숫자가 배열의 몇번째 있는지 찾아주는 함수를 작성
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr;
		
		System.out.print("배열 길이 입력: ");
		int length = sc.nextInt();
		arr = new int [length];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
		}
		search(arr);
	}
	
	public static void search(int [] arr) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("숫자 입력(0~9): ");
		int number = num.nextInt();
		if(number < 10) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i] == number) {
					System.out.println(i + "번째에 존재합니다.");
				} 
			}
		} else {
			System.out.println("잘못된 숫자입니다.");
		}
		
	}

}
