import java.util.Scanner;

public class FunctionEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1. 2차 배열을 2개 만들고 2개의 배열이 같은지 검사하는 함수
		 */
		Scanner sc = new Scanner(System.in);
		
		int [][] arr1;
		int [][] arr2;
		
		boolean run;
		
		System.out.print("첫 번째 크기 입력: ");
		int firstarr1 = sc.nextInt();
		int secondarr1 = sc.nextInt();
		
		System.out.print("두 번째 크기 입력: ");
		int firstarr2 = sc.nextInt();
		int secondarr2 = sc.nextInt();
		
		arr1 = new int [firstarr1][secondarr1];
		arr2 = new int [firstarr2][secondarr2];
		
		for(int i=0; i<arr1.length; i++) {
			for(int k=0; k<arr1[i].length; k++) {
				arr1[i][k] = (int)(Math.random()*10);
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int k=0; k<arr2[i].length; k++) {
				arr2[i][k] = (int)(Math.random()*10);
			}
		}
		
		run = arrayLength(arr1, arr2);
		
		if(run) {
			arraySame(arr1, arr2);
		} else {
			System.out.println("두 행렬의 길이가 다릅니다.");
		}
		
	}
	
	public static boolean arrayLength(int [][] arr1, int [][] arr2) {
		boolean length = true;
		
		if(arr1.length == arr2.length) {
			if(arr1 == null || arr2 == null) {
				length = false;
			} else if(arr1.length < 1 || arr2.length <1) {
				length = false;
			} else if(arr1[0].length == arr2[0].length) {
				length = true;
			} else {
				length = false;
			}
		} else {
			length = false;
		}
		return length;
	}
	
	public static void arraySame(int [][] arr1, int [][] arr2) {
		boolean same = true;
		
		for(int i=0; i<arr1.length; i++) {
			for(int k=0; k<arr1[i].length; k++) {
				if(arr1[i][k] == arr2[i][k]) {
					same = true;
				} else { 
					same = false;
					break;
				}
			}
		}
		if(same == true) {
			System.out.println("두 행렬은 길이와 값이 모두 같습니다.");
		} else {
			System.out.println("두 행렬은 길이는 같지만 값이 다릅니다.");
		}
	}

}
