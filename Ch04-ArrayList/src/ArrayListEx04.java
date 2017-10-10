import java.util.Scanner;

import javax.xml.stream.events.StartDocument;

public class ArrayListEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ma = new Scanner(System.in);
		Scanner en = new Scanner(System.in);
		
		int [][] student = new int[5][2];
		int mathmax=0, mathmin=100, engmax=0, engmin=100, mathsum=0, engsum=0;
		float mathavg, engavg;
		
		
		for(int i=0; i<student.length; i++) {
			for(int k=0; k<2; k++) {
				if(k==0) {
					System.out.print((i+1) + "번째 학생의 영어점수를 입력하세요: ");
					String str2 = en.nextLine();
					student[i][k] = Integer.parseInt(str2);
					engsum += student[i][k];
					if(engmin > student[i][k]) {
						engmin = student[i][k];
					} else if(engmax < student[i][k]) {
						engmax = student[i][k];
					}
				} else { 
					System.out.print((i+1) + "번째 학생의 수학점수를 입력하세요: ");
					String str = ma.nextLine();
					student[i][k] = Integer.parseInt(str);
					mathsum += student[i][k];
					if(mathmin > student[i][k]) {
						mathmin = student[i][k];
					} else if(mathmax < student[i][k]) {
						mathmax = student[i][k];
					}
				}			
			}
		}
		mathavg = (float)mathsum/5;
		engavg = (float)engsum/5;
		System.out.println("수학 평균: " + mathavg + " 영어 평균: " + engavg);
		System.out.println("수학 1등: " + mathmax + " 수학 꼴등: " + mathmin);
		System.out.println("영어 1등: " + engmax + " 영어 꼴등: " + engmin);
	}

}
