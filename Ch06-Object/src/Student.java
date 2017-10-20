
public class Student {
	String name;
	int age;
	String addr;
	private int weight;
	
	/*public Student(String tmpName, int tmpAge, String tmpAddr) {
		this.name = tmpName;
		this.age = tmpAge;
		this.addr = tmpAddr;
	}*/
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}	
	
	public void printInfo() {
		System.out.println("이름\t나이\t주소");
		System.out.println(this.name + "\t" + this.age + "\t" + this.addr);
	}
}
