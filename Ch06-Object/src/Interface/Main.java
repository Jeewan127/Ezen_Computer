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
		System.out.println("��ư�� Ŭ�� �߽��ϴ�.");
			}
		};

		button.setClickLisner(clickLisner);
		
		System.out.println("0�� �Է��ϸ� ��ư�� Ŭ�� �˴ϴ�. : ");
		number = scanner.nextInt();
			
		if (number == 0) {
			button.click();
		}
	}

}
