import javax.xml.stream.events.StartDocument;

public class ObjectMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student = new Student("학생", 70);
		
		Student student = new Student();
		System.out.println("이름: " + student.name);
		System.out.println("몸무게: " + student.getWeight()); 
	}

}
