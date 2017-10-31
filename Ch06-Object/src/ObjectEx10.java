// <공학용 계산기>

import java.util.Scanner;

public class ObjectEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("식을 입력하세요: ");
		String str = sc.nextLine();
		int num=0, start=0, a, b, c;
		int result =0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='+') {
				a = Integer.parseInt(str.substring(start, i));
				if(start == 0) {
					result = result+a;
				} else if(start > 0 && str.charAt(num) == '-') {
					result = result-a;
				} else if(start > 0 && str.charAt(num) == '+') {
					result = result+a;
				} 
				num = i;
				start = i+1;
			} else if(str.charAt(i)=='-') {
				b = Integer.parseInt(str.substring(start, i));
				if(start == 0) {
					result = result+b;
				} else if(start > 0 && str.charAt(num) == '-') {
					result = result-b;
				} else if(start > 0 && str.charAt(num) == '+') {
					result = result+b;
				}
				start = i+1;
				num = i;
			} 
		}
		if(str.charAt(start-1) == '-') {
			c = Integer.parseInt(str.substring(start, str.length()));
			result = result - c;
		} else if(str.charAt(start-1) == '+') {
			c = Integer.parseInt(str.substring(start, str.length()));
			result = result + c;
		}
		
		System.out.println("결과: " + result);
	}
}
