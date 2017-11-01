import java.util.HashMap;
import java.util.Iterator;

public class HashMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap();
		
		map.put(1, "value_1");
		map.put(2, "value_2");
		map.put(3, "value_3");
		
		System.out.println("비어잇는가?: " + map.isEmpty());
		System.out.println("맵의 크기: " + map.size());
		System.out.println("key1: " + map.get(1));
		System.out.println("1를 포합하는가: " + map.containsKey(1));
		map.remove(1);
		System.out.println("1를 포합하는가: " + map.containsKey(1));
		map.put(2, "value_4");
		System.out.println("key2: " + map.get(2));
		
		System.out.println();
		
		/*
		 	Iterator 인터페이스
		 	-> 모든 컬렉션으로 부터 정보를 얻을 수 있는 인터페이스
		 	즉, 자신의 컬렉션이라면 이터레이터 인터페이스를 사용할 수 있다.
		 */
		
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println("key : " + key + " value : " + map.get(key));
		}
	}
}
