import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class FileMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PATH = "./text.txt";
		
		byte[] data = null;
		String readString = null;
		InputStream in = null;
		
		try {
			in = new FileInputStream(PATH);
			data = new byte[in.available()];
			in.read(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(data != null) {
			try {
				readString = new String(data, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(readString);
	}

}
