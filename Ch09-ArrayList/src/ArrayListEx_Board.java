import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx_Board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Board> boards = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int num2 = 0;
		int number = 1;
		String str1 = "";
		String str2 = "";
		boolean bo  =false;
		
		do{
			printMenu();
			num = sc.nextInt();
			if(num == 0) {
				if(boards.isEmpty()) {
					System.out.println("��ȣ\t����");
					System.out.println("�Խù��� �����ϴ�.");
				} else {
					do {
						bo = false;
						System.out.println("��ȣ\t����");
						for(int i=0; i<boards.size(); i++) {
							boards.get(i).printInfo1();
						}
						System.out.print("�Խù� ��ȣ ����:   ");
						num = sc.nextInt();	
						
						for (int i = 0 ; i < boards.size() ; i++) {
							if (boards.get(i).getNumber() == num) {
								bo = true;
								boards.get(i).printInfo2();
								System.out.println();
								System.out.println("1: ����  2: ����  5: �������� ���ư���");
								System.out.print("�Է�: ");
								num2 = sc.nextInt();
								if(num2 == 1) {
									sc.nextLine();
									System.out.print("������ ����: ");
									str1 = sc.nextLine();
									boards.get(i).setContent(str1);
									//Board board = new Board(boards.get(i).getNumber(), boards.get(i).getName(), str1);
									//boards.set(i, board);
								} else if(num2 == 2) {
									boards.remove(i);
									if(boards.isEmpty()) {
										num2 = 5;
									}
								} 
															
							}
						}
						
						if(bo != true ) {
							System.out.println("�߸��� ��ȣ�Դϴ�.");
						}
						
					} while(num2 != 5);	
				}
			} else if(num == 1) {
				sc.nextLine();
				System.out.print("�����Է�: ");
				str1 = sc.nextLine();
				System.out.print("�����Է�: ");
				str2 = sc.nextLine();
				Board board = new Board(number, str1, str2);
				boards.add(board);
				number ++;
			}
		} while(num != 5);
		
	}
	public static void printMenu() {
		System.out.println("0: �Խù� ����  1: �Խù� �ۼ�");
		System.out.print("�Է�: ");
	}
}
