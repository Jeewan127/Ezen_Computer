
public class Score {
	private String win;
	private String lose;
	
	
	public Score(String win, String lose) {
		super();
		this.win = win;
		this.lose = lose;
	}
	
	public String saveData() {
		return this.win + "," + this.lose + "\n";
	}
	
	public String loadData() {
		return "WIN: " + this.win + " LOSE: " + this.lose;
	}
	
	public String getWin() {
		return win;
	}
	public void setWin(String win) {
		this.win = win;
	}
	public String getLose() {
		return lose;
	}
	public void setLose(String lose) {
		this.lose = lose;
	}
}
