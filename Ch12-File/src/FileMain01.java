import java.io.File;

public class FileMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:/Users/Public/Desktop/testFile01"); // 절대경로
		File file2 = new File("./File02.txt");	// 상대경로
		
		if(!file.exists()) {
			try {
				file.createNewFile();
				file2.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		// 현재 경로가 파일인지 검사, 경로가 파일이면 true를 반환
		boolean isFile = file.isFile();
		System.out.println("isFile: " + isFile);
		boolean isFile2 = file2.isFile();
		System.out.println("isFile2: " + isFile2);
		
		// 현재 경로가 디렉토리인지 검사, 경로가 디렉토리이면 true를 반환
		boolean isDir = file.isDirectory();
		System.out.println("isDir: " + isDir);
		boolean isDir2 = file2.isDirectory();
		System.out.println("isDir2: " + isDir2);
		
		// 절대경로를 반환
		String abspath = file.getAbsolutePath();
		System.out.println("path: " + abspath);
		
		// 파일이 존재하는지 검사
		boolean isExist = file.exists();
		System.out.println("file 존재여부: " + isExist);
	}

}
