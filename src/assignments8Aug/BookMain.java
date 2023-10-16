package assignments;

public class BookMain {

	public static void main(String[] args) {
		Book bookobj= new Book("highschool","HCVerma", "424235");
		bookobj.printBookDetails();
		
		bookobj.addBooks("English");
		bookobj.addBooks("Hindi");
		bookobj.addBooks("Sanskrit");
		bookobj.addBooks("Math");
		
		bookobj.getBookList();
		bookobj.printBookDetails();
		System.out.println("Removing some of the courses");
		bookobj.removeBooks("Math");
		bookobj.removeBooks("Physics");
		bookobj.printBookDetails();
	}

}
