import javax.xml.stream.events.StartDocument;

public class ObjectMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student = new Student("�л�", 70);
		
		Student student = new Student();
		System.out.println("�̸�: " + student.name);
		System.out.println("������: " + student.getWeight()); 
	}

}
