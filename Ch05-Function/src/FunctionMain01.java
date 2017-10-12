
public class FunctionMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFunction(3, "문자열");
		myFunction(10, "안녕");
		
	}
	
	public static void myFunction(int parameter1, String parameter2) {
		System.out.println("나는 함수입니다.");
		System.out.println("파라미너로 값을 받아 처리 할 수 있습니다.");
		System.out.println("prarameter1 = " + parameter1 + " " + "parameter2 = " + parameter2);
		
	}

}
