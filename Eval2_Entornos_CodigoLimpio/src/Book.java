import java.util.Arrays;

public class Book {
	String ISBN;
	String title;
	String[] authors;
	String editorial;
	Edition[] editions;

	public Book(String ISBN) {
		this.ISBN = ISBN;
	}

	int countAuthors() {
		return authors.length;
	}

	void addNewEdition(String name, String date, int id) {
		Edition[] newArray = Arrays.copyOf(editions, editions.length + 1);
		newArray[editions.length] = new Edition(name, date, id);
		editions = newArray;
	}

	class Edition {
		String name;
		String date;
		int id;
 
		public Edition(String name, String date, int id) {
			this.id = id;
			this.name = name;
			this.date = date;
		}
	}
}
