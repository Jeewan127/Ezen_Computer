package MiniGame;

public class TotalTreasure {
	
	private int character;
	private int score;
	private int totalScore;
	private int boom;
	private int map[] = new int [20];
	
	public TotalTreasure(int character, int score, int boom) {
		
		this.character = character;
		this.score = score;
		this.boom = boom;
	}

	public int getCharacter() {
		return character;
	}

	public void setCharacter(int character) {
		this.character = character;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getBoom() {
		return boom;
	}

	public void setBoom(int boom) {
		this.boom = boom;
	}

	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void printMap(int star) {
		for(int i=0; i<20; i++) {
			if(character == i && character == star) {
				System.out.print("@");
			} else if(score == i && score == star) {
				System.out.print("¡Ù");
				totalScore += 500;
			} else if(boom == i && boom == star) {
				System.out.print("X");
			} else if(star == i) {
				System.out.print("¡Ù");
			} else if(map[i] == 0) {
				System.out.print("¡à");
			} 
		} System.out.println();
	}
	
	public int checkMap(int star) {
		if((map.length-1) < star) {
			int tmp = star - map.length;
			star = tmp;
			return star;
		} else {
			return star;
		}
	}
}
