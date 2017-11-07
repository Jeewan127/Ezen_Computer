import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MembershipData {
public static MembershipData current = null;
	
	public static MembershipData getInstance() {
		if(current == null) {
			current = new MembershipData();
		}
		
		return current;
	}
	
	private MembershipData() {
		
	}
	
	public String readMembership(String membershipPATH) {
		byte[] data = null;
		String readMembership = null;
		InputStream inMembership = null;
		
		try {
			inMembership = new FileInputStream(membershipPATH);
			data = new byte[inMembership.available()];
			inMembership.read(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inMembership.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			readMembership = new String(data, "UTF-8");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return readMembership;
		
	}
	
	public void writeMembership(String membershipPATH, String memberships) {
		/*File fileMembership = new File(membershipPATH);
		
		if(!fileMembership.exists()) {
			try {
				fileMembership.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		OutputStream outMembership = null;
		try {
			byte[] bufferMembership = memberships.getBytes("UTF-8");
			outMembership = new FileOutputStream(membershipPATH);
			outMembership.write(bufferMembership);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				outMembership.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
