class Student1 {
	private String name;
	private int age;
	private String addr;
	private int sumAge=0;
	
	
/*	public Student1(String tmpName, int tmpAge, String tmpAddr) {
		this.name = tmpName;
		this.age = tmpAge;
		this.addr = tmpAddr;
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void studentPrint() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("주소: " + this.addr);
	}
}

public class ObjectEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 std1 = new Student1();
		Student1 std2 = new Student1();
		Student1 std3 = new Student1();
		
		std1.setName("지완");
		std1.setAge(26);
		std1.setAddr("부천");
		
		std2.setName("태형");
		std2.setAge(26);
		std2.setAddr("혜화");
		
		std3.setName("성민");
		std3.setAge(26);
		std3.setAddr("이천");
		
		std1.studentPrint();
		std2.studentPrint();
		std3.studentPrint();
		
		System.out.println("3명의 나이의 합: " + 
		(std1.getAge()+std2.getAge()+std3.getAge()));
	}

}
