
public class ArrayListMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mathGrades;
		mathGrades = new int[10];
		
		int sum=0;
		int avg=0;
		
		mathGrades[0] = 100;
		mathGrades[1] = 80;
		mathGrades[2] = 88;
		mathGrades[3] = 87;
		mathGrades[4] = 99;
		mathGrades[5] = 20;
		mathGrades[6] = 10;
		mathGrades[7] = 5;
		mathGrades[8] = 39;
		mathGrades[9] = 77;
		
		for(int i=0; i<mathGrades.length; i++) {
			sum += mathGrades[i];
		}
		
		avg = sum/mathGrades.length;
		
		System.out.println("이 반의 평균 수학점수는 " + avg + "입니다.");
	}

}
