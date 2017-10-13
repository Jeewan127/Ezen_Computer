import java.util.Scanner;
import java.util.Base64.Decoder;

import javax.xml.bind.ParseConversionEvent;

public class FunctionEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	������ �迭 �ϳ��� �����.
		 	�ű⿡ ���ڸ� �ִ´�.
		 	1. ��ȣȭ �Լ�(encoding)
		 	��ȣȭ �˰���: ���� + 10�� ���ؼ� ��ȣȭ -> String�� 10�� ���ϴ°�. (1+10=110)
		 	2. ���ڵ� �Լ�(decoding)
		 	���ڵ� �˰���: ���� / 100 �� �Ͽ� �ٽ� �Է��� ���ڰ� ������ �Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�: ");
		String num = sc.nextLine();
		
		String [] code = num.split("\\s"); /* num�� ����� ���ڰ� ���⿡ ���� �� �ܾ
										      code[]�� ���� */
		
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
