import java.util.Scanner;

public class StatementEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �ݴ�� ���
		Scanner num = new Scanner(System.in);
		
		int gogodan;
		
		System.out.println("������");
		System.out.print("���ڸ� �Է��ϼ���: ");
		
		gogodan = num.nextInt();
		
		for(int i=9; i>0; i--) {
			System.out.println(gogodan + "x" + i + "=" + gogodan*i);
		}
	}

}
