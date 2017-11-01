import java.util.HashMap;
import java.util.Iterator;

public class HashMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap();
		
		map.put(1, "value_1");
		map.put(2, "value_2");
		map.put(3, "value_3");
		
		System.out.println("����մ°�?: " + map.isEmpty());
		System.out.println("���� ũ��: " + map.size());
		System.out.println("key1: " + map.get(1));
		System.out.println("1�� �����ϴ°�: " + map.containsKey(1));
		map.remove(1);
		System.out.println("1�� �����ϴ°�: " + map.containsKey(1));
		map.put(2, "value_4");
		System.out.println("key2: " + map.get(2));
		
		System.out.println();
		
		/*
		 	Iterator �������̽�
		 	-> ��� �÷������� ���� ������ ���� �� �ִ� �������̽�
		 	��, �ڽ��� �÷����̶�� ���ͷ����� �������̽��� ����� �� �ִ�.
		 */
		
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println("key : " + key + " value : " + map.get(key));
		}
	}
}
