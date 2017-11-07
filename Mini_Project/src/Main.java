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
		ScoreData scoredata = ScoreData.getInstance();
		
		ArrayList<Membership> memberships = new ArrayList();
		ArrayList<Score> scores = new ArrayList<>();
		ArrayList<Character> characters = new ArrayList();
		
		boolean run = true;
		boolean run2 = true;
		int number = 0; // id, pw 저장 번호
		int num=0, num2=0;
		int winCount = 0;
		int loseCount = 0;
		int playChar;
		int cpuChar;
		int playHp = 0;
		int cpuHp = 0;
		
		String membershipPATH = "./membership.txt";
		
		String scorePATH = "./score.txt";
		
		// 캐릭터 정보 입력
		Character character [] = new Character[5];
		initialization(character);

		
		newMembershipFile(membershipPATH);
		newScoreFile(scorePATH);
		
		do{
			printLogin();
			num = sc.nextInt();
			if(num == 1) {
				String [] membership_data = null;				
				
				sc.nextLine();
				System.out.print("ID: ");
				String id = sc.nextLine();
				System.out.print("PW: ");
				String pw = sc.nextLine();
				
				String loadData = membershipdata.readMembership(membershipPATH);
				String[] datas = loadData.split("\n");
				
				for(int i=0; i<datas.length; i++) {
					membership_data = datas[i].split(",");
				} 
				
				if(id.equals(membership_data[0]) && pw.equals(membership_data[1])) 
				{
					System.out.println("로그인 성공");
					do {
						printMenu();
						num = sc.nextInt();
						if(num == 1) {
							do {
								initialization(character);
								printChar();	// 캐릭터 선택
								num2 = sc.nextInt();
								if(num2 == 6) {
									break;
								} 
								character[num2-1].printInfo(); // 캐릭터 정보 출력
								System.out.println();
								System.out.print("선택: ");
								num = sc.nextInt();
								if(num == 1) {
									playChar = num2-1;
									character[playChar].printName();
									System.out.println();
									System.out.println("<컴퓨터 캐릭터 선택>");
									cpuChar = cpuCharChoice(playChar);
									character[cpuChar].printName();
									System.out.println();
									System.out.println("<게임시작>");
									do {
										for(int i=0; i<2; i++) {
											if(i == 0) {
												System.out.println("사용자 공격차례");
												actionMenu();
												num = sc.nextInt();
												if(num == 1) {
													int ap = character[playChar].attack();
													cpuHp = character[cpuChar].hpMinus(ap);
													if(cpuHp < 0) {
														cpuHp = 0;
													}
													character[cpuChar].printHp(cpuHp);
													character[playChar].printMp();
													System.out.println();
												} else if(num == 2) {
													int skillAp = character[playChar].skillAttack();
													if(skillAp > 0) {
														cpuHp = character[cpuChar].hpMinus(skillAp);
														if(cpuHp < 0) {
															cpuHp = 0;
														}
														character[cpuChar].printHp(cpuHp);
														character[playChar].printMp();
														System.out.println();
													} else if(skillAp == 0) {
														System.out.println("마나가 부족합니다.");
														break;
													}
												} else if(num == 3) {
													character[playChar].printMp();
													break;
												}
											} else if(i == 1) {
												System.out.println("컴퓨터 공격차례");
												int cpuNum = (int)(Math.random()*2)+1;
												if(cpuNum == 1) {
													int ap = character[cpuChar].attack();
													playHp = character[playChar].hpMinus(ap);
													character[playChar].printHp(playHp);
													if(playHp < 0) {
														playHp = 0;
													}
													character[cpuChar].printMp();
													System.out.println();
												} else if(cpuNum == 2) {
													int skillAp = character[cpuChar].skillAttack();
													if(skillAp > 0) {
														playHp = character[playChar].hpMinus(skillAp);
														if(playHp < 0) {
															playHp = 0;
														}
														character[playChar].printHp(playHp);
														character[cpuChar].printMp();
														System.out.println();
													} else if(skillAp == 0) {
														System.out.println("마나가 부족합니다.");
														System.out.println();
														int ap = character[cpuChar].attack();
														playHp = character[playChar].hpMinus(ap);
														if(playHp < 0) {
															playHp = 0;
														}
														character[playChar].printHp(playHp);
														character[cpuChar].printMp();
														System.out.println();
														break;
													}
												}
											}
										}
										if(num != 3) {
											if(cpuHp <= 0) {
												System.out.println("사용자 승리");
												winCount++;
												run2 = false;
											} else if(playHp <= 0) {
												System.out.println("컴퓨터 승리");
												loseCount++;
												run2 = false;
											}
										}
									} while(run2);
								} else if(num == 2) {
									System.out.println("이전으로 돌아갑니다.");
								}
							} while(run2);
							run2 = true;
						} else if(num == 2) { // 전적 저장
							String win = "";
							String lose = "";
							String scoreData = "";
							//
							String [] score_data = null;
							
							win = Integer.toString(winCount);
							lose = Integer.toString(loseCount);
							
							String loadScore = scoredata.readScoredata(scorePATH);
							String [] dataScore = loadScore.split("\n");
							
							for(int i=0; i<dataScore.length; i++) {
								score_data = dataScore[i].split(",");
							}
							//
							Score score = new Score(win, lose);
							scores.add(score);
							
							scoreData += scores.get(0).saveData();
							
							scoredata.writeScore(scorePATH, scoreData);
							System.out.println("전적 저장완료");
							
						} else if(num == 3) { // 전적 확인
							String scoreData = ""; //
							
							String [] score_data = null;
							
							String loadScore = scoredata.readScoredata(scorePATH);
							String [] dataScore = loadScore.split("\n");
							
							for(int i=0; i<dataScore.length; i++) {
								score_data = dataScore[i].split(",");
							}
							
							System.out.println("Win: " + score_data[0]);
							System.out.println("lose: " + score_data[1]);	
							
						} else if(num == 4) {
							break;
						}
					} while(run2);
					
				} else {
					System.out.println("id 또는 pw가 틀렸습니다.");
				}
			} else if(num == 2) { // 회원가입
				do {
					String joinData = "";
					String id = "";
					String pw = "";
					
					String [] membership_data = null;				
					
					sc.nextLine();
					System.out.print("ID입력: ");
					id = sc.nextLine();
					System.out.print("PW입력: ");
					pw = sc.nextLine();
					
					String loadData = membershipdata.readMembership(membershipPATH);
					String[] datas = loadData.split("\n");
					
					for(int i=0; i<datas.length; i++) {
						membership_data = datas[i].split(",");
					}
					
					if(membership_data[0].equals(id)) {
						System.out.println("존재하는 아이디 입니다.");
						break;
					} else {
					Membership membership = new Membership(id, pw);
					memberships.add(membership);
					
					for(int i=0; i<memberships.size(); i++) {
						joinData += memberships.get(i).saveData();
					}
					membershipdata.writeMembership(membershipPATH, joinData);
					System.out.println("회원가입 완료");
					break;
				}
			} while(true);
				
			} else if(num == 3) {
				int count=1;
				
				String joinData = "";
				
				String [] membership_data = null;	
				
				String loadData = membershipdata.readMembership(membershipPATH);
				String[] datas = loadData.split("\n");
				
				for(int i=0; i<datas.length; i++) {
					membership_data = datas[i].split(",");
					Membership membership = new Membership(membership_data[0], membership_data[1]);
					memberships.add(membership);
					for(int k=0; k<memberships.size(); k++) {
						for(int r=k+1; r<memberships.size(); r++) {
							if(memberships.get(k).getId().equals( memberships.get(r).getId())) {
								memberships.remove(r);
							} 
						}
					}
				}
				
				for(Membership membership1: memberships) {
					System.out.println(count + " " + membership1.loadData());
					count++;
				}
				
				memberChange();
				num = sc.nextInt();
				
				if(num == 1) { // 수정
					System.out.print("수정할 번호 입력:");
					num = sc.nextInt();
					sc.nextLine();
					System.out.print("비밀번호 입력: ");
					String pw = sc.nextLine();
					memberships.get(num-1).setPw(pw);
					for(int i=0; i<memberships.size(); i++) {
						joinData += memberships.get(i).saveData();
					}
					membershipdata.writeMembership(membershipPATH, joinData);
				} else if(num == 2) {
					System.out.print("삭제할 번호 입력: ");
					num = sc.nextInt();
					memberships.remove(num-1);
					// 다시 저장
					for(int i=0; i<memberships.size(); i++) {
						joinData += memberships.get(i).saveData();
					}
					membershipdata.writeMembership(membershipPATH, joinData);
				} else if(num == 3) {
					System.out.println("초기로 이동");
				}
				
				
			} else if(num == 4) {
				System.out.println("종료 하였습니다.");
				run = false;
			}
		} while(run);
	}

	public static void initialization(Character character[]) {
		
		character[0] = new IronMan("아이언맨", 100, 0, 5, 10);
		character[1] = new SuperMan("슈퍼맨", 110, 0, 4, 10);
		character[2] = new Hulk("헐크", 120, 0, 4, 15);
		character[3] = new Thor("토르", 100, 0, 6, 10);
		character[4] = new SpiderMan("스파이더맨", 100, 0, 6, 9);
		
		IronMan ironman = (IronMan)character[0];
		SuperMan superman = (SuperMan)character[1];
		Hulk hulk = (Hulk)character[2];
		Thor thor = (Thor)character[3];
		SpiderMan spiderman = (SpiderMan)character[4];
	}
	
	public static void memberChange() {
		System.out.println("1: 수정  2: 삭제  3: 이전으로");
		System.out.print("입력:  ");
	}
	
	public static void actionMenu() {
		System.out.println("1: 공격  2: 스킬  3: MP확인");
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
		System.out.println("--------------------------------------------");
		System.out.println("1: 로그인  2: 회원가입  3: 회원정보  4: 종료");
		System.out.print("선택: ");
	}
	
	public static void printChar() {
		System.out.println("----<캐릭터 선택>----");
		System.out.println("    1. 아이언맨");
		System.out.println("     2. 슈퍼맨");
		System.out.println("      3. 헐크");
		System.out.println("      4. 토르");
		System.out.println("   5. 스파이더맨");
		System.out.println("    6. 이전으로");
		System.out.println("---------------------");
		System.out.print("선택 >>>>> ");
	}
	
	public static void printMenu() {
		System.out.println("1: 캐릭터 선택  2: 전적저장  3: 전적확인  4: 초기화면");
		System.out.print("선택>>>>>> ");
	}
	
	public static void newScoreFile(String scorePATH) {
		File fileScore = new File(scorePATH);
		
		if(!fileScore.exists()) {
			try {
				fileScore.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void newMembershipFile(String membershipPATH) {
		File fileMembership = new File(membershipPATH);
		
		if(!fileMembership.exists()) {
			try {
				fileMembership.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
