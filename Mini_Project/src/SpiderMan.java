
public class SpiderMan implements Character{
	
	private String name;
	private int hp; // 체력
	private int mp=0; // 마력
	private int dp; // 방어력
	private int ap; // 공격력
	private int skillAttack;

	public SpiderMan(String name, int hp, int mp, int dp, int ap) {
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
	
	public int getSkillAttack() {
		return skillAttack;
	}


	public void setSkillAttack(int skillAttack) {
		this.skillAttack = skillAttack;
	}
	
	@Override
	public int hpMinus(int attackPoint) {
		int result = attackPoint - this.dp;
		this.hp -= result;
		return this.hp;
	}
	
	@Override
	public void printHp(int hp) {
		if(hp == 0) {
			this.hp = 0;
			System.out.println(this.name + ": " + "HP: " + this.hp);	
		} else {
			System.out.println(this.name + ": " + "HP: " + this.hp);
		}	
	}
	
	@Override
	public void printMp() {
		System.out.println(this.name + ": " + "MP: " + this.mp);
	}
	
	@Override
	public int attack() {
		System.out.println(this.name + "기본공격");
		this.mp += 7;
		return this.ap;
	}
	
	@Override
	public int skillAttack() {
		if(this.mp >= 20) {
			System.out.println("일렉트로닉 거미줄!!");
			this.mp -= 20;
			this.skillAttack = 20;
		} else if(this.mp < 20) {
			this.skillAttack = 0;
		}
		return this.skillAttack;
	}

	@Override
	public void printInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.ap);
		System.out.println("방어력: " + this.dp);
		System.out.println("체력: " + this.hp);
		System.out.print("1: 선택\t2: 이전으로 돌아가기");
	}
	
	@Override
	public void printName() {
		System.out.println(this.name + "을 선택했습니다.");
	}
}
