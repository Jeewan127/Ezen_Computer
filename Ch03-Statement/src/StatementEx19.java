
public class StatementEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	1~10까지의 수를 랜덤하게 받고 10이 나올때 까지 아래의작업을 반복
		 	각각의 다음과 같은 숫자일 경우 해당하는 문자를 출력
		 */
		
		int num=0;
		
		while(num!=10) {
			num = (int)(Math.random()*10)+1;
			System.out.print(num + " ");
			if(num==1) {
				System.out.println("*");
			} else if(num==2) {
				System.out.println("o");
			} else if(num==3) {
				System.out.println("x");
			} else if(num==10){
				break;
			} else {
				System.out.println("@");
			}
		}
	}
}
