import java.util.Scanner;

public class FunctionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1. �Ķ���ͷ� 2���� ���� �ް� �� ���߿� ū ���� ��ȯ
		 	2. �Ķ���ͷ� 2���� ���� �ް� �� ���� ���� ���� ��ȯ
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° �� �Է�: ");
		int parameter1 = sc.nextInt();
		System.out.print("�� ��° �� �Է�: ");
		int parameter2 = sc.nextInt();
		
		max(parameter1, parameter2);
		min(parameter1, parameter2);
	}
	
	public static void max(int maxParameter1, int maxParameter2) {
		if(maxParameter1 > maxParameter2) {
			System.out.println("�� ���� ū ����: " + maxParameter1);
		} else if(maxParameter2 > maxParameter1) {
			System.out.println("�� ���� ū ����: " + maxParameter2);
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}
	}

	public static void min(int minParameter1, int minParameter2) {
		if(minParameter1 > minParameter2) {
			System.out.println("�� ���� ���� ����: " + minParameter2);
		} else if(minParameter2 > minParameter1) {
			System.out.println("�� ���� ���� ����: " + minParameter1);
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}
	}
}
