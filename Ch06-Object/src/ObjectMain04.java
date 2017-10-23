import java.util.Scanner;

public class ObjectMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		SuperMan superman = new SuperMan(10, 30, "슈퍼맨");
		BetMan betman = new BetMan(5, 30, 10, "베트맨");
		IronMan ironman = new IronMan(7, 30, 10, "아이언맨");
		Person selectedChar1 = null;
		Person selectedChar2 = null;
		
		boolean run = true;
		
		do {
			printMenu1();	// 1p 캐릭터
			int num = sc.nextInt();
			
			if(num == 1) {
				selectedChar1 = superman;
				System.out.println("슈퍼맨 캐릭터 선택");
			} else if(num == 2) {
				selectedChar1 = betman;
				System.out.println("베트맨 캐릭터 선택");
			} else if(num == 3) {
				selectedChar1 = ironman;
				System.out.println("아이언맨 캐릭터 선택");
			} else if(num == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
			
			printMenu2();	// 2p 캐릭터
			num = sc.nextInt();
			
			if(num == 1) {
				selectedChar2 = superman;
				System.out.println("슈퍼맨 캐릭터 선택");
			} else if(num == 2) {
				selectedChar2 = betman;
				System.out.println("베트맨 캐릭터 선택");
			} else if(num == 3) {
				selectedChar2 = ironman;
				System.out.println("아이언맨 캐릭터 선택");
			} else if(num == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
			
			if(run) {
				do {
					System.out.println();
					
					for(int i=0; i<2; i++) {
						if(i==0) {
							System.out.println("1p 공격차례");
							actionMenu();
							num = sc.nextInt();
							if(num == 1) {
								selectedChar1.attack();
								selectedChar2.getDamaged(selectedChar1.getAttackPoint());
								printAttack(selectedChar2.getEnergy());
								run = selectedChar2.isDead();
								if(run == false) {
									System.out.println("2p 승리");
									break;
								}
							} else if(num == 2) {
								System.out.print("1p: ");
								printCharInfo(selectedChar1);
								System.out.print("2p: ");
								printCharInfo(selectedChar2);
							}
						} else if(i==1) {
							System.out.println("2p 공격차례");
							actionMenu();
							num = sc.nextInt();
							if(num == 1) {
								selectedChar2.attack();
								selectedChar1.getDamaged(selectedChar2.getAttackPoint());
								printAttack(selectedChar1.getEnergy());
								run = selectedChar1.isDead();
								if(run == false) {
									System.out.println("1p 승리");
									break;
								}
							} else if(num == 2) {
								System.out.print("1p: ");
								printCharInfo(selectedChar1);
								System.out.print("2p: ");
								printCharInfo(selectedChar2);
							}
						}
					}
				}while(run);
			}
		} while(run);
	}
	
	public static void printMenu1() {
		System.out.println("1. 슈퍼맨\t2. 베트맨\t3. 아이언맨\t5. 종료");
		System.out.print("1p 캐릭터를 선택하세요: ");
	}
	
	public static void printMenu2() {
		System.out.println("1. 슈퍼맨\t2. 베트맨\t3. 아이언맨\t5. 종료");
		System.out.print("2p 캐릭터를 선택하세요: ");
	}

	public static void actionMenu() {
		System.out.println("1. 공격\t2. 캐릭터 정보");
		System.out.print(">>>>>>>> ");
	}
	
	public static void printCharInfo(Person selectedChar) {
		System.out.println("캐릭터 정보");
		System.out.println("캐릭터: " + selectedChar.getName());
		System.out.println("공격력: " + selectedChar.getAttackPoint());
		System.out.println("에너지: " + selectedChar.getEnergy());
		printAttack(selectedChar.getEnergy());
		System.out.println();
	}
	
	public static void printAttack(int energy) {
		System.out.print("남아 있는 에너지: ");
		for(int i=0; i<40; i++) {
			if(i < energy) {
				System.out.print("★");
			} else {
				System.out.print("☆");
			}
		} System.out.println();
	}
}


/*betman.setAttackPoint(50);
superman.setAttackPoint(100);
ironman.setAttackPoint(150);*/

/*		System.out.print("슈퍼맨 에너지 입력: ");
int supermanEnergy = sc.nextInt();
superman.setEnergy(supermanEnergy);

System.out.print("배트맨 에너지 입력: ");
int betmanEnergy = sc.nextInt();
betman.setEnergy(betmanEnergy);

System.out.print("아이언맨 에너지 입력: ");
int ironmanEnergy = sc.nextInt();
ironman.setEnergy(ironmanEnergy);

System.out.print("아이언맨 보조 에너지 입력: ");
int ironmanSecondEnergy = sc.nextInt();
ironman.setSecondEnergy(ironmanSecondEnergy);*/
