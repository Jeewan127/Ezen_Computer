
public class FileMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileHelper fileHelper = FileHelper.getInstance();
		fileHelper.writeFile("./text2.txt", "hi welcome");
		System.out.println("str: " + fileHelper.readFile("./text2.txt"));
	}

}
