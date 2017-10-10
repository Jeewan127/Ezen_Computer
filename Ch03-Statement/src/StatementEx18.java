import javax.swing.plaf.synth.SynthSeparatorUI;

public class StatementEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	2개의 변수에 각각 랜덤한 값을 저장하고
		 	두 수의 합이 홀수이면 두 수의 합을 화면에 출력하고
		 	두 수의 차가 홀수이면 두 수의 차를 화면에 출력하고 프로그램 종료
		 */
		
		int a, b;
		
		while(true) {
			a = (int)(Math.random()*100);
			b = (int)(Math.random()*100);
			
			if((a+b)%2==1) {
				System.out.println("a:" + a + " b: " + b);
				System.out.println(a+b);
			} else if(a>b) {
				System.out.println("a:" + a + " b: " + b);
				if((a-b)%2==1) {
				System.out.println(a-b);
				} else {
					System.out.println("해당없음");
				}
				break;
			} else if(b>a) {
				System.out.println("a:" + a + " b: " + b);
				if((b-a)%2==1) {
				System.out.println(b-a);
				} else {
					System.out.println("해당없음");
				}
				break;
			} else {
				System.out.println("해당없음");
				break;
			}
		}
	}

}
