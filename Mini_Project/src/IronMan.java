
public class IronMan implements Character{

	private String name;
	private int hp; // 체력
	private int mp=0; // 마력
	private int dp; // 방어력
	private int ap; // 공격력
	
	public IronMan(String name, int hp, int mp, int dp, int ap) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.dp = dp;
		this.ap = ap;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getDp() {
		return dp;
	}

	public void setDp(int dp) {
		this.dp = dp;
	}

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}


	@Override
	public void printInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.ap);
		System.out.println("방어력: " + this.dp);
		System.out.println("체력: " + this.hp);
		System.out.println("1: 선택\t2: 이전으로 돌아가기");
	}
	@Override
	public void printName() {
		System.out.println(this.name + "을 선택했습니다.");
	}

	@Override
	public int hpMinus(int attackPoint) {
		this.hp -= attackPoint;
		return hp;
	}

	@Override
	public int attack() {
		System.out.println(this.name + "기본공격");
		return this.ap;
	}

}
