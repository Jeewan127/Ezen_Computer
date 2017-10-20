import java.util.Scanner;

public class ArrayMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studentSize = 5;
		int classSize = 3;
		
		int [][] mathGrades = new int[classSize][studentSize];
		Scanner sc = new Scanner(System.in);
		int [] sum = new int[classSize];
		int [] avg = new int[classSize];
		
		for(int i=0; i<classSize; i++) {
			for(int j=0; j<studentSize; j++) {
				System.out.print((i+1) + "반의" + (j+1) + "번째 학생의 수학점수: ");
				mathGrades[i][j] = sc.nextInt();
				sum[i] += mathGrades[i][j];
			}
		}
		
		for(int i=0; i<classSize; i++) {
			avg[i] = sum[i] / studentSize;
			System.out.println((i+1) + "반의 평균: " + avg[i]);
		}
	}

}
