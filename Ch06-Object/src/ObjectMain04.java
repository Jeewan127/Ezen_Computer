import java.util.Scanner;

public class ObjectMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		SuperMan superman = new SuperMan(10, 30, "���۸�");
		BetMan betman = new BetMan(5, 30, 10, "��Ʈ��");
		IronMan ironman = new IronMan(7, 30, 10, "���̾��");
		Person selectedChar1 = null;
		Person selectedChar2 = null;
		
		boolean run = true;
		
		do {
			printMenu1();	// 1p ĳ����
			int num = sc.nextInt();
			
			if(num == 1) {
				selectedChar1 = superman;
				System.out.println("���۸� ĳ���� ����");
			} else if(num == 2) {
				selectedChar1 = betman;
				System.out.println("��Ʈ�� ĳ���� ����");
			} else if(num == 3) {
				selectedChar1 = ironman;
				System.out.println("���̾�� ĳ���� ����");
			} else if(num == 5) {
				System.out.println("���α׷� ����");
				run = false;
			}
			
			printMenu2();	// 2p ĳ����
			num = sc.nextInt();
			
			if(num == 1) {
				selectedChar2 = superman;
				System.out.println("���۸� ĳ���� ����");
			} else if(num == 2) {
				selectedChar2 = betman;
				System.out.println("��Ʈ�� ĳ���� ����");
			} else if(num == 3) {
				selectedChar2 = ironman;
				System.out.println("���̾�� ĳ���� ����");
			} else if(num == 5) {
				System.out.println("���α׷� ����");
				run = false;
			}
			
			if(run) {
				do {
					System.out.println();
					
					for(int i=0; i<2; i++) {
						if(i==0) {
							System.out.println("1p ��������");
							actionMenu();
							num = sc.nextInt();
							if(num == 1) {
								selectedChar1.attack();
								selectedChar2.getDamaged(selectedChar1.getAttackPoint());
								printAttack(selectedChar2.getEnergy());
								run = selectedChar2.isDead();
								if(run == false) {
									System.out.println("2p �¸�");
									break;
								}
							} else if(num == 2) {
								System.out.print("1p: ");
								printCharInfo(selectedChar1);
								System.out.print("2p: ");
								printCharInfo(selectedChar2);
							}
						} else if(i==1) {
							System.out.println("2p ��������");
							actionMenu();
							num = sc.nextInt();
							if(num == 1) {
								selectedChar2.attack();
								selectedChar1.getDamaged(selectedChar2.getAttackPoint());
								printAttack(selectedChar1.getEnergy());
								run = selectedChar1.isDead();
								if(run == false) {
									System.out.println("1p �¸�");
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
		System.out.println("1. ���۸�\t2. ��Ʈ��\t3. ���̾��\t5. ����");
		System.out.print("1p ĳ���͸� �����ϼ���: ");
	}
	
	public static void printMenu2() {
		System.out.println("1. ���۸�\t2. ��Ʈ��\t3. ���̾��\t5. ����");
		System.out.print("2p ĳ���͸� �����ϼ���: ");
	}

	public static void actionMenu() {
		System.out.println("1. ����\t2. ĳ���� ����");
		System.out.print(">>>>>>>> ");
	}
	
	public static void printCharInfo(Person selectedChar) {
		System.out.println("ĳ���� ����");
		System.out.println("ĳ����: " + selectedChar.getName());
		System.out.println("���ݷ�: " + selectedChar.getAttackPoint());
		System.out.println("������: " + selectedChar.getEnergy());
		printAttack(selectedChar.getEnergy());
		System.out.println();
	}
	
	public static void printAttack(int energy) {
		System.out.print("���� �ִ� ������: ");
		for(int i=0; i<40; i++) {
			if(i < energy) {
				System.out.print("��");
			} else {
				System.out.print("��");
			}
		} System.out.println();
	}
}


/*betman.setAttackPoint(50);
superman.setAttackPoint(100);
ironman.setAttackPoint(150);*/

/*		System.out.print("���۸� ������ �Է�: ");
int supermanEnergy = sc.nextInt();
superman.setEnergy(supermanEnergy);

System.out.print("��Ʈ�� ������ �Է�: ");
int betmanEnergy = sc.nextInt();
betman.setEnergy(betmanEnergy);

System.out.print("���̾�� ������ �Է�: ");
int ironmanEnergy = sc.nextInt();
ironman.setEnergy(ironmanEnergy);

System.out.print("���̾�� ���� ������ �Է�: ");
int ironmanSecondEnergy = sc.nextInt();
ironman.setSecondEnergy(ironmanSecondEnergy);*/
