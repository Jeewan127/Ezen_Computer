
public class StatementMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 100;
		
		if (grade < 60) {
			System.out.println("60�� ���ϴ� �����Դϴ�.");
		} else if (grade >= 60 && grade < 70) {
			System.out.println("60~69���� ������ C�Դϴ�.");
		} else if (grade >= 70 && grade < 80) {
			System.out.println("70~79���� ������ B�Դϴ�.");
		} else if (grade >= 80 && grade < 90) {
			System.out.println("80~89���� ������ A�Դϴ�.");
		} else {
			System.out.println("90�� �̻��� A+�Դϴ�.");
		}
	}

}
