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
		
		// 캐릭터 정보 입력
		Character character [] = new Character[5];
		
		character[0] = new IronMan("아이언맨", 50, 0, 4, 6);
		character[1] = new SuperMan("슈퍼맨", 60, 0, 3, 6);
		character[2] = new Hulk("헐크", 60, 0, 2, 8);
		character[3] = new Thor("토르", 45, 0, 4, 7);
		character[4] = new SpiderMan("스파이더맨", 50, 0, 5, 5);
		
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
					System.out.println("로그인 성공");
					do {
						printChar();	// 캐릭터 선택
						num = sc.nextInt(); 
						character[num-1].printInfo(); // 캐릭터 정보 출력
						System.out.print("선택: ");
						num = sc.nextInt();
						if(num == 1) {
							playChar = num-1;
							character[playChar].printName();
							System.out.println();
							System.out.println("<컴퓨터 캐릭터 선택>");
							cpuChar = cpuCharChoice(playChar);
							character[cpuChar].printName();
							System.out.println("<게임시작>");
							character[playChar].printName();
							System.out.print(" vs ");
							character[cpuChar].printName();
							if(run2) {
								for(int i=0; i<2; i++) {
									System.out.println("사용자 공격차례");
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
							System.out.println("이전으로 돌아갑니다.");
						}
					} while(run2);
				} else {
					System.out.println("id 또는 pw가 틀렸습니다.");
				}
			} else if(num == 2) {
				String joinData = "";
				sc.nextLine();
				System.out.print("ID입력: ");
				id = sc.nextLine();
				System.out.print("PW입력: ");
				pw = sc.nextLine();
				Membership membership = new Membership(id, pw);
				memberships.add(membership);
				
				joinData += memberships.get(number).saveData();
				number ++;
				
				membershipdata.writeMembership(membershipPATH, joinData);
				System.out.println("회원가입 완료");
			} else if(num == 3) {
				System.out.println("종료 하였습니다.");
				run = false;
			}
		} while(run);
	}
	
	public static void actionMenu() {
		System.out.println("1: 공격  2: 스킬");
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
		System.out.println("1: 로그인  2: 회원가입  3: 종료");
		System.out.print("선택: ");
	}
	
	public static void printChar() {
		System.out.println("----<캐릭터 선택>----");
		System.out.println("    1. 아이언맨");
		System.out.println("     2. 슈퍼맨");
		System.out.println("      3. 헐크");
		System.out.println("      4. 토르");
		System.out.println("   5. 스파이더맨");
		System.out.println("---------------------");
		System.out.println("선택 >>>>> ");
	}
}
