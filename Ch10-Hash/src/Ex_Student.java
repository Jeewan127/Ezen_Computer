
public class Ex_Student {
	private String name;
	private String phoneNum;
	
	public Ex_Student(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	public void printInfo() {
		System.out.println(this.name + "\t" + this.phoneNum);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}
