package Interface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		Button button = new Button();

		ClickLisner clickLisner = new ClickLisner() {
			
		@Override
		public void onClick() {
		System.out.println("버튼을 클릭 했습니다.");
			}
		};

		button.setClickLisner(clickLisner);
		
		System.out.println("0을 입력하면 버튼이 클릭 됩니다. : ");
		number = scanner.nextInt();
			
		if (number == 0) {
			button.click();
		}
	}

}
