
public class Membership {
	private String id;
	private String pw;
	
	public Membership(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String saveData() {
		return this.id + "," + this.pw + "\n";
	}
	
	public String loadData() {
		return "ID: " + this.id + " PW: " + this.pw;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
