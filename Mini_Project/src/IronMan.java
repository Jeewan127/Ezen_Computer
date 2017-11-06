
public class IronMan implements Character{

	private String name;
	private int hp; // ü��
	private int mp=0; // ����
	private int dp; // ����
	private int ap; // ���ݷ�
	
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
		System.out.println("�̸�: " + this.name);
		System.out.println("���ݷ�: " + this.ap);
		System.out.println("����: " + this.dp);
		System.out.println("ü��: " + this.hp);
		System.out.println("1: ����\t2: �������� ���ư���");
	}
	@Override
	public void printName() {
		System.out.println(this.name + "�� �����߽��ϴ�.");
	}

	@Override
	public int hpMinus(int attackPoint) {
		this.hp -= attackPoint;
		return hp;
	}

	@Override
	public int attack() {
		System.out.println(this.name + "�⺻����");
		return this.ap;
	}

}
