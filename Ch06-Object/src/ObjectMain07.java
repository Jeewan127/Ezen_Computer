
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
			System.out.println("문자열 변환 오류: " + e.getMessage());
			System.out.println("루프문 강제 종료");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 데이터를 찾을 수 없습니다" + e.getMessage());
		} catch (Exception e) {
			System.out.println("알수 없는 오류가 발생하였습니다.");
		} finally {
			System.out.println("처리 완료");
		}
		
	}
	
	

}
