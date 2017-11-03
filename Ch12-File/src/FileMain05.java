import java.util.HashMap;
import java.util.Iterator;

public class FileMain05 {

	public static void main(String[] args) {
		FileHelper fileHelper = FileHelper.getInstance();
		
		HashMap<Integer, Book> books = new HashMap<>();	
		
		Book book = new Book(1, "book", 1000);
		Book book2 = new Book(2, "book2", 3000);
		Book book3 = new Book(3, "book3", 3000);
		
		books.put(book.getNumber(), book);
		books.put(book2.getNumber(), book2);
		books.put(book3.getNumber(), book3);
		
		String saveData = "";
		Iterator<Integer> keys = books.keySet().iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			
			saveData += books.get(key).saveData();
		}
		
		fileHelper.writeFile("./save.txt", saveData);
		System.out.println("저장 완료");
	}

}
