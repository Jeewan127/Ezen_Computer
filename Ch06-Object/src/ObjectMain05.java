class Parent {
	public void say() {
		System.out.println("im parent");
	}
}

class Child extends Parent{
	@Override
	public void say() {
		System.out.println("im child");
	}
	
	public void hello() {
		System.out.println("hello");
	}
}

class Child2 extends Parent {
	@Override
	public void say() {
		System.out.println("im child2");
	}
	
	public void specialChild() {
		System.out.println("im special child");
	}
}


public class ObjectMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		Child2 child2 = new Child2();
		Parent parent = null;
		
		parent = child;
		parent.say();
		((Child)parent).hello();
		
		if (parent instanceof Child2) {
			((Child2)parent).specialChild();
		}
		
		parent = child2;
		parent.say();
		if (parent instanceof Child2) {
			((Child2)parent).specialChild();
		}		
	}

}
