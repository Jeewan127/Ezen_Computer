
public class StatementEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	정수형 변수에 1~8까지의 수를 랜덤하게 받고
		 	랜덤값이 5가 나오면 프로그램이 종료, 그 외에 수가 나오면 화면에 출력
		 */
		
		int num=0;
		
		while (num!=5)  {
			num = (int)((Math.random()*8)+1); // 1~8까지 랜덤으로 출력
			if(num!=5) {
				System.out.println(num);
			} else {
				System.out.println("프로그램이 종료됩니다.");
			}
		}
	}
}
