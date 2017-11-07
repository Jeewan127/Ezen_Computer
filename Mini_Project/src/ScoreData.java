import java.awt.im.InputContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileLockInterruptionException;

import org.xml.sax.InputSource;

public class ScoreData {
	public static ScoreData current = null;
	
	public static ScoreData getInstance() {
		if(current == null) {
			current = new ScoreData();
		}
		
		return current;
	}
	
	private ScoreData() {
		
	}
	
	public String readScoredata(String scorePATH) {
		byte [] data = null;
		String readScore = null;
		InputStream inScore = null;
		
		try {
			inScore = new FileInputStream(scorePATH);
			data = new byte[inScore.available()];
			inScore.read(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inScore.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			readScore = new String(data, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return readScore;
	}
	
	public void writeScore(String scorePATH, String scores) {
		/*File fileScore = new File(scorePATH);
		
		if(!fileScore.exists()) {
			try {
				fileScore.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		OutputStream outScore = null;
		try {
			byte[] bufferScore = scores.getBytes("UTF-8");
			outScore = new FileOutputStream(scorePATH);
			outScore.write(bufferScore);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				outScore.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
