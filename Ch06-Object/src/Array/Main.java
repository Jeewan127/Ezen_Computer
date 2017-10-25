package Array;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student[] students = new Student[3];
		
		students[0] = new Student("김태희",30,100,80,60);
		students[1] = new Student("전지현", 25,80,80,60);
		students[2] = new Student("수지", 20,70,80,70);
		
		for (int i = 0 ; i < students.length ; i++) {
			System.out.println("이름 : " + students[i].getName());
			System.out.println("나이 : " + students[i].getAge());
			System.out.println("수학점수 : " + students[i].getMathGrade());
			System.out.println("영어점수 : " + students[i].getEngGrade());
			System.out.println("과학점수 : " + students[i].getSciGrade());
		}
		System.out.println();
		System.out.println("수학 평균 : " + getMathAvgClass(students));
		System.out.println("영어 평균 : " + getEngAvgClass(students));
		System.out.println("과학 평균 : " + getSciAvgClass(students));
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
