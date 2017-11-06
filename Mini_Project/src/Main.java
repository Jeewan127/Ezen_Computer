import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MembershipData membershipdata = MembershipData.getInstance();
		ArrayList<Membership> memberships = new ArrayList();
		ArrayList<Character> characters = new ArrayList<>();
		boolean run = true;
		boolean run2 = true;
		int number = 0;
		int num=0;
		int playChar;
		int cpuChar;
		String membershipPATH = "./membership.txt";
		String id = "";
		String pw = "";
		
		// ĳ���� ���� �Է�
		Character character [] = new Character[5];
		
		character[0] = new IronMan("���̾��", 50, 0, 4, 6);
		character[1] = new SuperMan("���۸�", 60, 0, 3, 6);
		character[2] = new Hulk("��ũ", 60, 0, 2, 8);
		character[3] = new Thor("�丣", 45, 0, 4, 7);
		character[4] = new SpiderMan("�����̴���", 50, 0, 5, 5);
		
		IronMan ironman = (IronMan)character[0];
		SuperMan superman = (SuperMan)character[1];
		Hulk hulk = (Hulk)character[2];
		Thor thor = (Thor)character[3];
		SpiderMan spiderman = (SpiderMan)character[4];
		
		do{
			printLogin();
			num = sc.nextInt();
			if(num == 1) {
				String [] membership_data = null;
				
				sc.nextLine();
				System.out.print("ID: ");
				id = sc.nextLine();
				System.out.print("PW: ");
				pw = sc.nextLine();
				
				String loadData = membershipdata.readMembership(membershipPATH);
				String[] datas = loadData.split("\n");
				
				for(int i=0; i<datas.length; i++) {
					membership_data = datas[i].split(",");
				}
				
				if(id.equals(membership_data[0]) && pw.equals(membership_data[1])) {
					System.out.println("�α��� ����");
					do {
						printChar();	// ĳ���� ����
						num = sc.nextInt(); 
						character[num-1].printInfo(); // ĳ���� ���� ���
						System.out.print("����: ");
						num = sc.nextInt();
						if(num == 1) {
							playChar = num-1;
							character[playChar].printName();
							System.out.println();
							System.out.println("<��ǻ�� ĳ���� ����>");
							cpuChar = cpuCharChoice(playChar);
							character[cpuChar].printName();
							System.out.println("<���ӽ���>");
							character[playChar].printName();
							System.out.print(" vs ");
							character[cpuChar].printName();
							if(run2) {
								for(int i=0; i<2; i++) {
									System.out.println("����� ��������");
									actionMenu();
									if(i == 1) {
										int ap = character[playChar].attack();
										int hp = character[cpuChar].hpMinus(ap);
									} else if(i == 2) {
										int ap = character[cpuChar].attack();
										int hp = character[playChar].hpMinus(ap);
									}
								}
							}
							
						} else if(num == 2) {
							System.out.println("�������� ���ư��ϴ�.");
						}
					} while(run2);
				} else {
					System.out.println("id �Ǵ� pw�� Ʋ�Ƚ��ϴ�.");
				}
			} else if(num == 2) {
				String joinData = "";
				sc.nextLine();
				System.out.print("ID�Է�: ");
				id = sc.nextLine();
				System.out.print("PW�Է�: ");
				pw = sc.nextLine();
				Membership membership = new Membership(id, pw);
				memberships.add(membership);
				
				joinData += memberships.get(number).saveData();
				number ++;
				
				membershipdata.writeMembership(membershipPATH, joinData);
				System.out.println("ȸ������ �Ϸ�");
			} else if(num == 3) {
				System.out.println("���� �Ͽ����ϴ�.");
				run = false;
			}
		} while(run);
	}
	
	public static void actionMenu() {
		System.out.println("1: ����  2: ��ų");
	}
	
	public static int cpuCharChoice(int playChar) {
		boolean cpu = true;
		int cpuChar;
		do {
			cpuChar = (int)(Math.random()*5);
			if(cpuChar == playChar) {
				cpu = true;
			} else {
				cpu = false;
			}
		} while(cpu);
		
		return cpuChar;
	}

	public static void printLogin() {
		System.out.println("---------------------------");
		System.out.println("1: �α���  2: ȸ������  3: ����");
		System.out.print("����: ");
	}
	
	public static void printChar() {
		System.out.println("----<ĳ���� ����>----");
		System.out.println("    1. ���̾��");
		System.out.println("     2. ���۸�");
		System.out.println("      3. ��ũ");
		System.out.println("      4. �丣");
		System.out.println("   5. �����̴���");
		System.out.println("---------------------");
		System.out.println("���� >>>>> ");
	}
}
