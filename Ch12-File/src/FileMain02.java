import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PATH = "./text.txt";
		
		String writeString = "Hello. I'm hungry.";
		
		OutputStream out = null;
		try {
			byte [] buffer = writeString.getBytes("UTF-8");
			
			out = new FileOutputStream(PATH);
			out.write(buffer);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
