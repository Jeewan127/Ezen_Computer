package Game;
import java.util.Scanner;

// 로또 프로그램
class Lotto {
	Scanner sc = new Scanner(System.in);
	int lotto [] = new int [6];
	int user [] = new int [6];
	int bonus = (int)(Math.random()*45)+1;
	int score=0;
	int bonusScore = 0;
	int count=0;
	
	int d1=0, d2=0, d3=0, d4=0, d5=0;
	
	public void lottoNum() { // 로또 숫자를 중복되지 않게 비교하여 받아옴
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int k=0; k<i; k++) {
				if(lotto[i] == lotto[k] || lotto[i] == bonus) {
					i--;
				}
			}
		}
	}
	
	public void userNum() { // 내가 산 로또를 중복되지 않게 비교하여 받아옴
		for(int i=0; i<user.length; i++) {
			user[i] = (int)(Math.random()*45)+1;
			for(int k=0; k<i; k++) {
				if(user[i] == user[k]) {
					i--;
				}
			}
		}
	}
	
	public void lottoPrint() {
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void userPrint() {
		for(int i=0; i<user.length; i++) {
			System.out.print(user[i] + " ");
		}
	}

	public void lottoResult() {
		for(int i=0; i<lotto.length; i++) {
			for(int k=i; k<i+1; k++) {
				if(user[i] == lotto[k]) {
					score += 2;
				} else if(user[i] == bonus) {
					bonusScore += 2;
				}
			}
		}
	}
	
	public void lottoRank() {
		if(this.score == 12) {
			System.out.println("1등 당첨입니다.");
			this.d1 ++;
		} else if(this.score == 8 && this.bonusScore == 2) {
			System.out.println("2등 당첨입니다.");
			this.d2 ++;
		}else if(this.score == 10) {
			System.out.println("3등 당첨입니다.");
			this.d3 ++;
		} else if(this.score == 8) {
			System.out.println("4등 당첨입니다.");
			this.d4 ++;
		} else if(this.score == 6) {
			System.out.println("5등 당첨입니다.");
			this.d5 ++;
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

	public void resultPrint() {
		System.out.println("1등\t2등\t3등\t4등\t5등");
		System.out.println(d1 + "\t" + d2 + "\t" + d3 + "\t" + d4 + "\t" + d5);
		System.out.println("총 횟수: " + this.count);
	}
}

public class Lotto_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Lotto lotto = new Lotto();
		
		lotto.lottoNum();
		
		while(lotto.d1 != 1) {
			
			lotto.userNum();
			System.out.print("로또 번호는: ");
			lotto.userPrint();
			System.out.println();
			lotto.lottoResult();
			lotto.lottoRank();
			System.out.println();
			lotto.count++;
		}
		
		lotto.resultPrint();
	}

}
