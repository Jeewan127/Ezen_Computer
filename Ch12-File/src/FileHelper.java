import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class FileHelper {
public static FileHelper current = null;
	
	public static FileHelper getInstance() {
		if (current == null) {
			current = new FileHelper();
		}
		
		return current;
	}
	
	private FileHelper() {
		
	}
	
	public String readFile(String filePath) {		
		byte[] data = null;
		String readString = null;
		InputStream in = null;
		
		try {
			in = new FileInputStream(filePath);
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
		
		try {
			readString = new String(data,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return readString;
	}
	
	public void writeFile(String filePath,String content) {
		File file = new File(filePath);
		
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		OutputStream out = null;		
		try {
			byte[] buffer = content.getBytes("UTF-8");			
			out = new FileOutputStream(filePath);
			out.write(buffer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
