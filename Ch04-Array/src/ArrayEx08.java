import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("맵 길이 입력: ");
		int mapn = sc.nextInt();
		
		int [] map = new int[mapn];	// 맵 크기 설정
		int number, x, count=0; // number: 입력받는 숫자, x: 지뢰위치, count: 게임 클리어 조건
		int a=map.length+1, b=map.length+2; // 맵 크기보다 크게 해야 맵크기를 결정했을때
											// 처음에 숫자가 겹치지 않음
		boolean run = true;	// 루프문을 돌리기 위해서 존재
		
		for(int i=0; i<map.length; i++) { // 맵을 0으로 초기화
			map[i] = 0;
		}
		
		x = (int)(Math.random()*(map.length));	// 맵 크기안에 랜덤으로 지뢰 생성
		
		do {
			// 맵 출력 문.
			for(int i=0; i<map.length; i++) {
				if(a == i) { // 지뢰 출력
					System.out.print("X");	
				} else if(b == i || map[i] == 2) { // 맵에 2가 있거나 b에 지뢰가 없을경우
					map[b] = 2; // b==i 라는 건 숫자를 입력했을때 지뢰가 없어서 그 위치를 계속
								// 저장해줘야 하기 때문에 2로 지정해서 저장해줌
					System.out.print("O");                                                                                     
					} else if(map[i] == 0) { // 아직 아무것도 하지 않은 곳.
					System.out.print("#");
				}
			}
			
			System.out.print(" " + x); // 테스트용, 지뢰위치 표시
			System.out.println("");
			System.out.print("값을 입력하세요: "); // 숫자 입력
			number = sc.nextInt(); // 입력한 값 저장
			
			// 지뢰 출력
			if(number == x) { // 입력한 값이 x와 같으면
				a = x; // a에 x의 값을 저장
				System.out.println("지뢰를 밟았습니다.");
				// run이 false이 되기때문에 지뢰를 밟고나서 맵을 한번더 출력해 주기 위해서 존재
				for(int i=0; i<map.length; i++) {	
					// 위에서와 달리 a에는 지뢰의 위치인 x값이 저장되어 있기 때문에
					// 지뢰가 있는곳에 X 표시가 출력
					if(a == i) {		
						System.out.print("X");
					} else if(b == i || map[i] == 2) { // 위에와 동일
						map[b] = 2;
						System.out.print("O");
						} else if(map[i] == 0) {
						System.out.print("#");
					}
				}
				run = false;	// run이 false되면서 루프문 종료	
			} else if(number != x) { // 만약 입력한 값이 지뢰가 아니라면
				if(map[number] == 2) { // 입력한 값이 이미 선택했던 값이 라면
						System.out.println("이미 선택하셨습니다.");
					} else if(number > map.length){ // 입력한 값이 맵 크기보다 크면
						System.out.println("잘못 입력하셨습니다.");
					} else { // 처음 입력 한 곳이라면 b에 입력한 숫자를 넣어주고 카운트를 증가시킴
						b = number;
						count ++;
					}
			}
			
			// 클리어
			if(count == map.length-1) { // 카운트가 맵크기에서 1을 뺀 숫자와 같으면 클리어 조건이 만족
				System.out.println();
				System.out.println("게임 클리어");
				for(int i=0; i<map.length; i++) {	// 지뢰때와 마찬가지로 run이 false이 되어 끝나기때문에
					if(a == i) {					// 맵 한번더 출력. 형식은 같음
						System.out.print("X");
					} else if(b == i || map[i] == 2) {
						map[b] = 2;
						System.out.print("O");
						} else if(map[i] == 0) {
						System.out.print("#");
					}
				}
				run = false;
			}
		
		} while(run);
	}
}
