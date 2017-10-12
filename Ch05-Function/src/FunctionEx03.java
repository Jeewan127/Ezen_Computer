import java.util.Scanner;

public class FunctionEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1. 파라미터로 1차 정수형 배열을 받고 
		 	그 중에서 가장 큰수를 반환 하는 함수를 작성하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		String num = sc.nextLine();
		
		String [] numarr = num.split("\\s");

		maxArray(numarr);
		System.out.println();
		minArray(numarr);
	}

	public static void maxArray(String [] maxnum) {
		int max=0;
		for(int i=1; i<maxnum.length; i++) {
			if(max < Integer.parseInt(maxnum[i])) {
				max = Integer.parseInt(maxnum[i]); 
			} 
		}
		System.out.println("큰값은: " + max);
	}
	
	public static void minArray(String [] minnum) {
		int min = 1000;
		for(int i=1; i<minnum.length; i++) {
			if(min > Integer.parseInt(minnum[i])) {
				min = Integer.parseInt(minnum[i]); 
			}
		}
		System.out.println("작은값은: " + min);
	}
}
