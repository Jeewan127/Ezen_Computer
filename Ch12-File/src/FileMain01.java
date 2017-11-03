import java.io.File;

public class FileMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:/Users/Public/Desktop/testFile01"); // ������
		File file2 = new File("./File02.txt");	// �����
		
		if(!file.exists()) {
			try {
				file.createNewFile();
				file2.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		// ���� ��ΰ� �������� �˻�, ��ΰ� �����̸� true�� ��ȯ
		boolean isFile = file.isFile();
		System.out.println("isFile: " + isFile);
		boolean isFile2 = file2.isFile();
		System.out.println("isFile2: " + isFile2);
		
		// ���� ��ΰ� ���丮���� �˻�, ��ΰ� ���丮�̸� true�� ��ȯ
		boolean isDir = file.isDirectory();
		System.out.println("isDir: " + isDir);
		boolean isDir2 = file2.isDirectory();
		System.out.println("isDir2: " + isDir2);
		
		// �����θ� ��ȯ
		String abspath = file.getAbsolutePath();
		System.out.println("path: " + abspath);
		
		// ������ �����ϴ��� �˻�
		boolean isExist = file.exists();
		System.out.println("file ���翩��: " + isExist);
	}

}
