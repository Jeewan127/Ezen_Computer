import java.util.Scanner;

public class FunctionEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1. 2�� �迭�� 2�� ����� 2���� �迭�� ������ �˻��ϴ� �Լ�
		 */
		Scanner sc = new Scanner(System.in);
		
		int [][] arr1;
		int [][] arr2;
		
		boolean run;
		
		System.out.print("ù ��° ũ�� �Է�: ");
		int firstarr1 = sc.nextInt();
		int secondarr1 = sc.nextInt();
		
		System.out.print("�� ��° ũ�� �Է�: ");
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
			System.out.println("�� ����� ���̰� �ٸ��ϴ�.");
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
			System.out.println("�� ����� ���̿� ���� ��� �����ϴ�.");
		} else {
			System.out.println("�� ����� ���̴� ������ ���� �ٸ��ϴ�.");
		}
	}

}
