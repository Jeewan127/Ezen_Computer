package MiniGame2;

public class Character {
	private int y;
	private int x;
	private int moveCount;
	
	public Character(int y,int x, int moveCount) {
		this.y = y;
		this.x = x;
		this.moveCount = moveCount;
	}
	
	public void incMoveCount() {
		this.moveCount++;
	}
	
	public void moveLeft() {
		this.x--;
	}
	
	public void moveRight() {
		this.x++;
	}
	
	public void moveUp() {
		this.y--;
	}
	
	public void moveDown() {
		this.y++;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getMoveCount() {
		return moveCount;
	}
	public void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
	}
}
