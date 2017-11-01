package Array;

public class Student {
	private String name;
	private int age;
	private int mathGrade;
	private int engGrade;
	private int sciGrade;
		
	public Student(String name,int age,int mathGrade,int engGrade,int sciGrade) {
		this.name = name;
		this.age = age;
		this.mathGrade = mathGrade;
		this.engGrade = engGrade;
		this.sciGrade = sciGrade;
	}
	
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
		public int getMathGrade() {
		return mathGrade;
	}
		public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}
		public int getEngGrade() {
		return engGrade;
	}
		public void setEngGrade(int engGrade) {
		this.engGrade = engGrade;
	}
		public int getSciGrade() {
		return sciGrade;
	}
		public void setSciGrade(int sciGrade) {
		this.sciGrade = sciGrade;
	}	
}

