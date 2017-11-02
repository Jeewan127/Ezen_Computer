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
					System.out.println("번호\t제목");
					System.out.println("게시물이 없습니다.");
				} else {
					do {
						bo = false;
						System.out.println("번호\t제목");
						for(int i=0; i<boards.size(); i++) {
							boards.get(i).printInfo1();
						}
						System.out.print("게시물 번호 선택:   ");
						num = sc.nextInt();	
						
						for (int i = 0 ; i < boards.size() ; i++) {
							if (boards.get(i).getNumber() == num) {
								bo = true;
								boards.get(i).printInfo2();
								System.out.println();
								System.out.println("1: 수정  2: 삭제  5: 이전으로 돌아가기");
								System.out.print("입력: ");
								num2 = sc.nextInt();
								if(num2 == 1) {
									sc.nextLine();
									System.out.print("수정할 내용: ");
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
							System.out.println("잘못된 번호입니다.");
						}
						
					} while(num2 != 5);	
				}
			} else if(num == 1) {
				sc.nextLine();
				System.out.print("제목입력: ");
				str1 = sc.nextLine();
				System.out.print("내용입력: ");
				str2 = sc.nextLine();
				Board board = new Board(number, str1, str2);
				boards.add(board);
				number ++;
			}
		} while(num != 5);
		
	}
	public static void printMenu() {
		System.out.println("0: 게시물 보기  1: 게시물 작성");
		System.out.print("입력: ");
	}
}
