public class ArrayListEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num;
		int count=1;
		
		String [][] month = new String[6][7];
		
		month [0][0] = "��";
		month [0][1] = "��";
		month [0][2] = "ȭ";
		month [0][3] = "��";
		month [0][4] = "��";
		month [0][5] = "��";
		month [0][6] = "��";
		
		for(int i=1; i<6; i++) {
			for(int k=0; k<7; k++) {
				month[i][k] = String.valueOf(count);
				count ++;
			}
		}
		

		// �޷� ���
		for(int r=0; r<6; r++) {
			for(int e=0; e<7; e++) {
				if(r==0) {
					System.out.print(month[r][e] + "\t");
				} else {
					if(Integer.parseInt(month[r][e]) <= 31) {
						System.out.print(month[r][e] + "\t");
					} else {
						break;
					}
				}
			}
			System.out.println();
		}
	}
}
