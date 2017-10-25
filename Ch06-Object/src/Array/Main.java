package Array;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student[] students = new Student[3];
		
		students[0] = new Student("������",30,100,80,60);
		students[1] = new Student("������", 25,80,80,60);
		students[2] = new Student("����", 20,70,80,70);
		
		for (int i = 0 ; i < students.length ; i++) {
			System.out.println("�̸� : " + students[i].getName());
			System.out.println("���� : " + students[i].getAge());
			System.out.println("�������� : " + students[i].getMathGrade());
			System.out.println("�������� : " + students[i].getEngGrade());
			System.out.println("�������� : " + students[i].getSciGrade());
		}
		System.out.println();
		System.out.println("���� ��� : " + getMathAvgClass(students));
		System.out.println("���� ��� : " + getEngAvgClass(students));
		System.out.println("���� ��� : " + getSciAvgClass(students));
	}
	
	public static int getMathAvgClass(Student[] students) {
		int avg=0;
		
		for (int i = 0 ; i < students.length ; i++) {
			avg += students[i].getMathGrade();
		}
		
		return (avg / students.length);
	}
	
	public static int getEngAvgClass(Student[] students) {
		int avg=0;
		
		for (int i = 0 ; i < students.length ; i++) {
			avg += students[i].getEngGrade();
		}
		
		return (avg / students.length);
	}
	
	public static int getSciAvgClass(Student[] students) {
		int avg=0;
		
		for (int i = 0 ; i < students.length ; i++) {
			avg += students[i].getSciGrade();
		}
		
		return (avg / students.length);
	}

}
