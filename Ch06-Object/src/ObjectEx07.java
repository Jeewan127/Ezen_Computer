
public class ObjectEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int map [] = {10, 50, 70, 87, 4875, 986};
		int max = 0;
		
		for(int i=0; i<map.length; i++) {
			max = Math.max(max, map[i]);
		}
		System.out.println("�ִ밪: " + max);
	}

}
