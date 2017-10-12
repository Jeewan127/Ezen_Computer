import java.util.Scanner;

public class Baekjoon1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다.
		 	이 문장에는 몇 개의 단어가 있을까?
		 	이를 구하는 프로그램 작성.
		 	단, 단어는 띄어쓰기 하나로 구분된다.
		 	첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문장이 주어진다.
		 	이 문장의 길이는 1,000,000을 넘지 않는다.
		 */
		/*
		 	경우의 수를 다 따져야 함. (아직 못품)
		 */
		Scanner sc = new Scanner(System.in);
		
		String sentenceIn = sc.nextLine();
		
		String [] sentence = sentenceIn.split("\\s");
		
		System.out.println(sentence.length);
		
	}

}
