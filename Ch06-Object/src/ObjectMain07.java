
public class ObjectMain07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String [3];
		arr[0] = "1234";
		arr[1] = "Hi";
		arr[2] = "1000";
		
		try {
			for(int i=0; i<5; i++) {
				int number = Integer.parseInt(arr[i]);
			}
		} catch (NumberFormatException e) {
			System.out.println("���ڿ� ��ȯ ����: " + e.getMessage());
			System.out.println("������ ���� ����");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �����͸� ã�� �� �����ϴ�" + e.getMessage());
		} catch (Exception e) {
			System.out.println("�˼� ���� ������ �߻��Ͽ����ϴ�.");
		} finally {
			System.out.println("ó�� �Ϸ�");
		}
		
	}
	
	

}
