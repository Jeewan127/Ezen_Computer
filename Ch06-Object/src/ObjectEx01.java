import java.util.Scanner;

/*
  	학생 객체를 생성하고 아래의 정보를 추가
  	
  	학생 객체 안에는 학생에 대한 정보
  	이름, 나이, 주소
  	
  	학생에 대한 정보를 출력하는 메서드를 하나 생성
  	학생객체를 사용하여 학생의 이름, 나이, 주소를 입력후
  	학생에 대한 정보를 출력하는 프로그램을 작성하세요.
 */
public class ObjectEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		
		Scanner sc = new Scanner(System.in);
		
//		sc.nextLine();
		System.out.print("이름 입력: ");
		student.name = sc.nextLine();
		System.out.print("나이 입력: ");
		student.age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소 입력: ");
		student.addr = sc.nextLine();
		
		student.printInfo();
		
	}

}
