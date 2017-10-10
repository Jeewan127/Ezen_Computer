
public class StatementMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 100;
		
		if (grade < 60) {
			System.out.println("60점 이하는 과락입니다.");
		} else if (grade >= 60 && grade < 70) {
			System.out.println("60~69사이 점수는 C입니다.");
		} else if (grade >= 70 && grade < 80) {
			System.out.println("70~79사이 점수는 B입니다.");
		} else if (grade >= 80 && grade < 90) {
			System.out.println("80~89사이 점수는 A입니다.");
		} else {
			System.out.println("90점 이상은 A+입니다.");
		}
	}

}
