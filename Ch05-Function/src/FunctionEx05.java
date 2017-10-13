import java.util.Scanner;
import java.util.Base64.Decoder;

import javax.xml.bind.ParseConversionEvent;

public class FunctionEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	정수형 배열 하나를 만든다.
		 	거기에 숫자를 넣는다.
		 	1. 암호화 함수(encoding)
		 	암호화 알고리즘: 숫자 + 10을 더해서 암호화 -> String에 10을 더하는것. (1+10=110)
		 	2. 디코딩 함수(decoding)
		 	디코딩 알고리즘: 숫자 / 100 을 하여 다시 입력한 숫자가 나오게 한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		String num = sc.nextLine();
		
		String [] code = num.split("\\s"); /* num에 저장된 숫자가 띄어쓰기에 의해 한 단어씩
										      code[]에 저장 */
		
		int[] encode;
		int [] decode;
		
		encode=encoding(code);
		for(int i=0; i<encode.length; i++) {
			System.out.print(encode[i] + "\t");
		}
		System.out.println();
		decode=decoding(encode);
		for(int i=0; i<decode.length; i++) {
			System.out.print(decode[i] + "\t");
		}
	}
	
	public static int[] encoding(String[] code) {
		String [] mix = new String[code.length];
		int [] codearr = new int[code.length];
		for(int i=0; i<code.length; i++) {
			mix[i] = code[i]+10;
		}
		for(int r=0; r<code.length; r++) {
			codearr[r] = Integer.parseInt(mix[r]);
		}
		return codearr;
	
	}
	
	public static int[] decoding(int[] decodearr) {
		for(int i=0; i<decodearr.length; i++) {
			decodearr[i] = decodearr[i]/100;
		}

		return decodearr;

	}
}
