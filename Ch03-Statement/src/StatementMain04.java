
public class StatementMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("90점 이상입니다.");
			break;
		case 'B':
			System.out.println("80~89점 사이입니다.");
			break;
		case 'C':
			System.out.println("70~79점 사이입니다.");
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
			break;
		}
	}
}
