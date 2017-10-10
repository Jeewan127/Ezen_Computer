
public class OperatorMain01 {

	public static void main(String[] args) {
		int number = 10;
		int result = 0;

		number++; // number = number + 1 or number += 1 ·Î ¹Ù²ã ¾µ ¼ö ÀÖÀ½.
		System.out.println(number);
		
		number--; // number = number - 1 or number -= 1 ·Î ¹Ù²ã ¾µ ¼ö ÀÖÀ½.
		System.out.println(number);
		
		number += 3;
		System.out.println(number);
		
		result = number % 3;  // %: ³ª´°¼À
		System.out.println(result);
		
		int a = 0;
		int b = 1;
		boolean res;
		
		res = (a == b);
		System.out.println(res);
		
		res = (a != b);
		System.out.println(res);
		
	}

}
