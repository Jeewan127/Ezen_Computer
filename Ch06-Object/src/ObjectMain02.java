class InfoStudent {
	String name;
	int age;
	
	public InfoStudent(String tempName, int tempAge) {
		name = tempName;
		age = tempAge;
	}
	
	public void printStudent() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
	}
}

public class ObjectMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfoStudent stu1 = new InfoStudent("ö��", 19);
		InfoStudent stu2 = new InfoStudent("����", 20);
		
		stu1.printStudent();
		stu2.printStudent();
	}

}
