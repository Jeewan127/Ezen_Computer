import java.util.HashMap;
import java.util.Iterator;

public class FileMain06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileHelper fileHelper = FileHelper.getInstance();
		HashMap<Integer, Book> books = new HashMap<>();	
		String loadData = fileHelper.readFile("./save.txt");
		
		String[] datas = loadData.split("\n");
		
		for (int i = 0 ; i < datas.length ; i++) {
			String[] book_data = datas[i].split(",");
			
			Book book = new Book(Integer.parseInt(book_data[0]), 
					book_data[1], Integer.parseInt(book_data[2]));
			
			books.put(book.getNumber(), book);
		}		
		
		Iterator<Integer> keys = books.keySet().iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			books.get(key).printBookInfo();
		}
	}

}
